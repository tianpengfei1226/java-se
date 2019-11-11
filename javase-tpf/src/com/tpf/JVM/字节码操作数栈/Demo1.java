package com.tpf.JVM.字节码操作数栈;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  Demo1.java,v 1.0, 2018/10/30-9:30 tianpengfei Exp $
 */
public class Demo1 {
	public static void main(String[] args) {
		int i = 0;
//		i = i++;
//
//
////		int j = i++;
////		int k = ++i;
//		System.out.println("i = " + i);

		i = i++ + i++;
		System.out.println("i = " + i);

//		System.out.println("j = " + j);
//		System.out.println("k = " + k);
	}
}
