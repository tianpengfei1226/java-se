package com.tpf.designpattern.回调.烧水例子;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  MainTest.java,v 1.0, 2019/7/31-10:25 tianpengfei Exp $
 */
public class MainTest {
	public static void main(String[] args) throws Exception {
//		同步等待 obj1 = new 同步等待();
//		obj1.make();
//		异步执行同步回调 obj2 = new 异步执行同步回调();
//		obj2.make();

		异步执行异步回调 obj3 = new 异步执行异步回调();
		obj3.make();
	}
}
