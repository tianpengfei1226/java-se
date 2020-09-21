package com.tpf.test.money;

/**
 * <p> 金额测试类 </p>
 *
 * @author : tianpengfei
 * @version :  MoneyTest.java,v 1.0, 2018/11/19-13:50 tianpengfei Exp $
 */
public class MoneyTest {
	public static void main(String[] args) {
		Money m1 = new Money("1");
		Money m2 = new Money("1.00");
		System.out.println(m1.equals(m2));
		System.out.println(m1.getCurrency());

		Money m3 = new Money("2.00");
		System.out.println(m3.greaterThan(m1));
		Money m4 = new Money("-2.00");
		System.out.println(m4.multiply(-1));

		String account= "0123456789";
		System.out.println(account.substring(account.length() - 5));
	}
}
