package com.tpf.designpattern.观察者模式.事件驱动.田鹏飞;

import java.util.EventListener;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  OrderRmsListener.java,v 1.0, 2018/11/26-13:05 tianpengfei Exp $
 */
public interface OrderRmsListener extends EventListener {
	void update(OrderRmsEvent event);
}
