package com.tpf.designpattern.观察者模式.事件驱动.nacos;

/**
 * <p> </p >
 *
 * @author : tianpf
 * @version :  NamingEvent.java,v 1.0, 2020/9/11-15:04 tianpengfei Exp $
 */
public class NamingEvent implements Event {

    private String serviceName;

    public NamingEvent() {
    }

    public NamingEvent(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
