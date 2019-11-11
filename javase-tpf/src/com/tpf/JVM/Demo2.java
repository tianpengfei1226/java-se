package com.tpf.JVM;

/**
 * <p> 通过swap方法把a和b的值做一个交换，交换以后输出的结果是a=2，b=1. </p>
 *
 * @author : tianpengfei
 * @version :  Demo2.java,v 1.0, 2018/10/31-11:12 tianpengfei Exp $
 */
public class Demo2 {
	public static void main(String[] args) {
		Integer a =1;
		Integer b =2;
		System.out.println("a = " + a + " , b = " + b );
		swap(a, b);
		System.out.println("a = " + a + " , b = " + b );
	}

	private static void swap(Integer a, Integer b) {
		// TODO
	}
}
