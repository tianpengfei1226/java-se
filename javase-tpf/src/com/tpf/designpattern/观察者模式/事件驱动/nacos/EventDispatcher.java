package com.tpf.designpattern.观察者模式.事件驱动.nacos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

/**
 * <p> </p >
 *
 * @author : tianpf
 * @version :  EventDispatcher.java,v 1.0, 2020/9/11-15:06 tianpengfei Exp $
 */
public class EventDispatcher {

    private ExecutorService executor = null;

    private final BlockingQueue<ServiceInfo> changedServices = new LinkedBlockingQueue<ServiceInfo>();

    private final ConcurrentMap<String, List<EventListener>> observerMap = new ConcurrentHashMap<String, List<EventListener>>();

    private volatile boolean closed = false;

    public EventDispatcher() {
        this.executor = Executors.newSingleThreadExecutor(new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r, "com.alibaba.nacos.naming.client.listener");
                thread.setDaemon(true);

                return thread;
            }
        });

        executor.execute(new Notifier());
    }

    public void addListener(String serviceName, EventListener listener) {
        List<EventListener> observers = Collections.synchronizedList(new ArrayList<EventListener>());
        observers.add(listener);
        observers = observerMap.putIfAbsent(serviceName, observers);
        if (observers != null) {
            observers.add(listener);
        }

        serviceChanged(serviceName);
    }

    public void serviceChanged(String serviceName) {
        if (serviceName == null) {
            return;
        }

        changedServices.add(new ServiceInfo(serviceName));
    }



    private class Notifier implements Runnable {

        @Override
        public void run() {
            while (!closed) {
                ServiceInfo serviceInfo = null;
                try {
                    serviceInfo = changedServices.poll(5, TimeUnit.MINUTES);
                } catch (Exception ignore) {
                }

                if (serviceInfo == null) {
                    continue;
                }

                // 这里需要捕获异常，否则一旦有一个报错了，其他事件都无法处理了
                try {
                    List<EventListener> listeners = observerMap.get(serviceInfo.getName());

                    if (listeners!= null && listeners.size()>0) {
                        for (EventListener listener : listeners) {
                            System.out.println("------------------"+Thread.currentThread().getName());
                            listener.onEvent(new NamingEvent(serviceInfo.getName()));
                        }
                    }

                } catch (Exception e) {
                    System.out.println("[NA] notify error for service: " + serviceInfo.getName() + ", clusters: "+ e);
                }
            }
        }
    }

}
