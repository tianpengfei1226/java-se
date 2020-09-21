package com.tpf.designpattern.观察者模式.事件驱动.nacos;

/**
 * <p> </p >
 *
 * @author : tianpf
 * @version :  ServiceInfo.java,v 1.0, 2020/9/11-15:07 tianpengfei Exp $
 */
public class ServiceInfo {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServiceInfo() {
    }

    public ServiceInfo(String name) {
        this.name = name;
    }
}
