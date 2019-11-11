package com.tpf.thread.线程锁;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  Lock1.java,v 1.0, 2019/9/20-9:29 tianpengfei Exp $
 */
public class Lock1 {
	public static void main(String[] args) {
		Phone1 phone1 = new Phone1();
		new Thread(() -> {
			phone1.getAndroid();
		}, "A").start();

		new Thread(() ->
			phone1.getIos()
		, "B").start();
	}
}

class Phone1 {
	public synchronized void getIos(){
		System.out.println("=======getIos=======");
	}
	public synchronized void getAndroid(){
		System.out.println("=======getAndroid=======");
	}
}
