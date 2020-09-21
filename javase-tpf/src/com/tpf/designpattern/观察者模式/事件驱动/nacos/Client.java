package com.tpf.designpattern.观察者模式.事件驱动.nacos;

import java.util.concurrent.TimeUnit;

/**
 * <p> </p >
 *
 * @author : tianpf
 * @version :  Client.java,v 1.0, 2020/9/11-15:11 tianpengfei Exp $
 */
public class Client {
    public static void main(String[] args) throws Exception{
        NamingService namingService = new NamingService();

        namingService.subscribe("第一个数据", new EventListener() {
            @Override
            public void onEvent(Event event) throws InterruptedException {
                if (event instanceof NamingEvent) {
                    System.out.println("第一次消费");
                    // 模拟消费时间
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(((NamingEvent) event).getServiceName());
                }
            }
        });

//        EventDispatcher eventDispatcher = new EventDispatcher();
//        eventDispatcher.serviceChanged("123");
//        eventDispatcher.serviceChanged("123");
//        eventDispatcher.serviceChanged("123");
//        eventDispatcher.serviceChanged("123");
        TimeUnit.SECONDS.sleep(3);

        System.out.println("***************************");

        namingService.subscribe("第二个数据", new EventListener() {
            @Override
            public void onEvent(Event event) {
                if (event instanceof NamingEvent) {
                    System.out.println("第二次消费");
                    System.out.println(((NamingEvent) event).getServiceName());
                }
            }
        });

        TimeUnit.SECONDS.sleep(5);
    }
}
