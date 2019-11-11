package com.tpf.juc;

import java.util.concurrent.CountDownLatch;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  CountDownLatchTest.java,v 1.0, 2019/10/8-16:10 tianpengfei Exp $
 */
public class CountDownLatchTest {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch startSignal = new CountDownLatch(1);
		CountDownLatch doneSignal = new CountDownLatch(3);

		for (int i = 0; i < 3; i++) {
			new Thread(()->{
				try {
					System.out.println("Aid thread is waiting for starting.");
					startSignal.await();
					// do sth
					System.out.println("Aid thread is doing something.");
					doneSignal.countDown();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}).start();
		}

		// main thread do sth
		Thread.sleep(2000);
		System.out.println("Main thread is doing something.");
		startSignal.countDown();

		// main thread do sth else
		System.out.println("Main thread is waiting for aid threads finishing.");
		doneSignal.await();

		System.out.println("Main thread is doing something after all threads have finished.");

	}
}
