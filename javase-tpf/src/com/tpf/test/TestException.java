package com.tpf.test;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  TestException.java,v 1.0, 2018/11/20-11:56 tianpengfei Exp $
 */
public class TestException {
	public static void main(String[] args) {
		try {
			aaa();
			System.out.println("================");
		} catch (Exception e) {
			System.out.println("error >>> " + e);
		}
	}

	private static void aaa() {
		throw new RuntimeException("通过会员号获取个人信息失败");
	}
}
