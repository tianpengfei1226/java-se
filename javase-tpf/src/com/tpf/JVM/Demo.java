package com.tpf.JVM;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  Demo.java,v 1.0, 2018/10/31-10:01 tianpengfei Exp $
 */
public class Demo {
	public static void main(String[] args) {
		int i = 1;
		add(i);
		System.out.println(i);
	}

	private static void add(int i) {
		++i;
	}
}
