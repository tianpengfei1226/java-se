package com.tpf.designpattern.观察者模式.事件驱动.nacos;

/**
 * <p> </p >
 *
 * @author : tianpf
 * @version :  EventListener.java,v 1.0, 2020/9/11-15:05 tianpengfei Exp $
 */
public interface EventListener {

    void onEvent(Event event) throws InterruptedException;

}
