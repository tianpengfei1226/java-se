package com.tpf.thread.线程锁;

import java.util.concurrent.TimeUnit;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  Lock1.java,v 1.0, 2019/9/20-9:29 tianpengfei Exp $
 */
public class Lock2 {
	public static void main(String[] args) {
		Phone2 phone2 = new Phone2();
		new Thread(() -> {
			try {
				phone2.getAndroid();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}, "A2").start();

		new Thread(() -> {
			try {
				phone2.getIos();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		, "B2").start();
	}
}

class Phone2 {
	public synchronized void getIos()throws Exception{
		TimeUnit.SECONDS.sleep(2);
		System.out.println("=======getIos=======");
	}
	public synchronized void getAndroid()throws Exception{
		System.out.println("=======getAndroid=======");
	}
}
