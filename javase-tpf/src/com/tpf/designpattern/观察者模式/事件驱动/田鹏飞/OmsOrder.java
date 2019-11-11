package com.tpf.designpattern.观察者模式.事件驱动.田鹏飞;

/**
 * <p> </p>
 * 首先事件驱动模型与观察者模式勉强的对应关系可以看成是，被观察者相当于事件源，观察者相当于监听器，
 * 事件源会产生事件，监听器监听事件。所以这其中就搀和到四个类，事件源，事件，监听器以及具体的监听器。
 *
 * @author : tianpengfei
 * @version :  OmsOrder.java,v 1.0, 2018/11/26-12:54 tianpengfei Exp $
 */
public class OmsOrder {
	/**
	 * 订单号：FI0000001
	 */
	private String orderNo;
	private double amount;

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
