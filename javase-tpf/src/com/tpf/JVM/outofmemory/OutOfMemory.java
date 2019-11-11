package com.tpf.JVM.outofmemory;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  OutOfMemory.java,v 1.0, 2018/11/9-10:50 tianpengfei Exp $
 */
public class OutOfMemory {
	public static void main(String[] args) {
		long arr[];
		for (int i = 1; i <= 10000000; i *= 2) {
			arr = new long[i];
		}
		System.out.println("end.....");
	}
}
