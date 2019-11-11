package com.tpf.designpattern.观察者模式.事件驱动.田鹏飞;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  OmsOrderClient.java,v 1.0, 2018/11/26-13:08 tianpengfei Exp $
 */
public class OmsOrderClient {
	public static void main(String[] args) {
		OmsOrder order1 = new OmsOrder();
		order1.setAmount(1);
		order1.setOrderNo("FI0000001");

		OmsOrder order2 = new OmsOrder();
		order2.setAmount(2);
		order2.setOrderNo("FI0000002");


	}
}
