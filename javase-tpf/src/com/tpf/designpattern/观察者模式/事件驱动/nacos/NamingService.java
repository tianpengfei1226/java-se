package com.tpf.designpattern.观察者模式.事件驱动.nacos;

/**
 * <p> </p >
 *
 * @author : tianpf
 * @version :  NamingService.java,v 1.0, 2020/9/11-15:13 tianpengfei Exp $
 */
public class NamingService {
    EventDispatcher eventDispatcher = new EventDispatcher();

    public void subscribe(String serviceName, EventListener listener) throws Exception {
        eventDispatcher.addListener(serviceName, listener);
    }



}
