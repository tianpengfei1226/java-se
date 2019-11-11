package com.tpf.thread.线程锁;

import java.util.concurrent.TimeUnit;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  Lock1.java,v 1.0, 2019/9/20-9:29 tianpengfei Exp $
 */
public class Lock3 {
	public static void main(String[] args) {
		Phone3 phone3 = new Phone3();
		new Thread(() -> {
			try {
//				phone3.getAndroid();
				phone3.hello();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}, "A3").start();

		new Thread(() -> {
			try {
				phone3.getIos();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		, "B3").start();
	}
}

class Phone3 {
	public synchronized void getIos()throws Exception{
		TimeUnit.SECONDS.sleep(2);
		System.out.println("=======getIos=======");
	}
	public synchronized void getAndroid()throws Exception{
		System.out.println("=======getAndroid=======");
	}
	public void hello()throws Exception{
		System.out.println("---hello---");
	}
}
