package com.tpf.thread.线程锁;

import java.util.concurrent.TimeUnit;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  Lock1.java,v 1.0, 2019/9/20-9:29 tianpengfei Exp $
 */
public class Lock4 {
	public static void main(String[] args) {
		Phone4 phone4 = new Phone4();
		Phone4 phone4_ = new Phone4();
		new Thread(() -> {
			try {
				phone4_.getAndroid();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}, "A4").start();

		new Thread(() -> {
			try {
				phone4.getIos();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		, "B4").start();
	}
}

class Phone4 {
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
