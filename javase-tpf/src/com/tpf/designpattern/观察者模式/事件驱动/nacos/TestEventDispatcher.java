package com.tpf.designpattern.观察者模式.事件驱动.nacos;

import java.util.concurrent.*;

/**
 * <p> </p >
 *
 * @author : tianpf
 * @version :  TestEventDispatcher.java,v 1.0, 2020/9/11-16:23 tianpengfei Exp $
 */
public class TestEventDispatcher {
    private ExecutorService executor = null;

    private final LinkedBlockingQueue<String> changedServices = new LinkedBlockingQueue<>();

    public TestEventDispatcher() {
        this.executor = Executors.newSingleThreadExecutor(new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r, "tpf-test....");
                thread.setDaemon(true);

                return thread;
            }
        });

        executor.execute(()->{
            while (true) {
                System.out.println("************");
                try {
                    String str = changedServices.poll(5, TimeUnit.SECONDS);
                    System.out.println("消费 --> " + str);
                } catch (Exception e) {

                }
            }
        });
    }

    public static void main(String[] args) throws InterruptedException {
        TestEventDispatcher testEventDispatcher = new TestEventDispatcher();
//        TimeUnit.SECONDS.sleep(3);
        System.out.println();

        System.out.println("add tpf");
        testEventDispatcher.changedServices.add("tpf");
        testEventDispatcher.changedServices.add("tpf123");
        System.out.println();

        TimeUnit.SECONDS.sleep(2);
//        System.out.println();
//
//        System.out.println("add nacos");
//        testEventDispatcher.changedServices.add("nacos");
//        System.out.println();
//
//        TimeUnit.SECONDS.sleep(3);
//        System.out.println("end....");




    }
}
