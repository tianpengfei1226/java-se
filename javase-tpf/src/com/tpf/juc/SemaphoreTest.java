package com.tpf.juc;

import java.util.concurrent.Semaphore;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  SemaphoreTest.java,v 1.0, 2019/10/8-16:33 tianpengfei Exp $
 */
public class SemaphoreTest {
	public static void main(String[] args) throws InterruptedException {
		Semaphore semaphore = new Semaphore(6);
		for (int i = 0; i < 6; i++) {
			new Thread(() -> {
				System.out.println("----");
			}).start();
		}
		semaphore.acquire();
		System.out.println("===========");

	}
}
