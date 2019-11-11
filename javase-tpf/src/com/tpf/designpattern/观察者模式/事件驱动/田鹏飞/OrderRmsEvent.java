package com.tpf.designpattern.观察者模式.事件驱动.田鹏飞;

import java.util.EventObject;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  OrderRmsEvent.java,v 1.0, 2018/11/26-13:04 tianpengfei Exp $
 */
public class OrderRmsEvent extends EventObject {

	/**
	 * Constructs a prototypical Event.
	 *
	 * @param source The object on which the Event initially occurred.
	 * @throws IllegalArgumentException if source is null.
	 */
	public OrderRmsEvent(Object source) {
		super(source);
	}

	public OmsOrder getOmsOrder() {
		return (OmsOrder) super.getSource();
	}
}
