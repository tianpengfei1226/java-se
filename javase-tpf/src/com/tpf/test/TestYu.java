package com.tpf.test;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  TestYu.java,v 1.0, 2018/11/19-15:27 tianpengfei Exp $
 */
public class TestYu {
	public static void main(String[] args) {
		int x, y = 10;
		if (((x = 0) == 0) || ((y = 0)) == 20) {
			System.out.println("现在Y的值是：" + y);
		}
		int a, b = 10;
		if (((a = 0) == 0) || ((b = 20)) == 20) {
			System.out.println("现在b的值是：" + b);
		}
		System.out.println("===========================");
		if (false || ((b = 20)) == 20) {
			System.out.println("现在b的值是：" + b);
		}

	}
}
