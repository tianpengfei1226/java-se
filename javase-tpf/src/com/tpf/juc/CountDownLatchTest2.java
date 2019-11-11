package com.tpf.juc;

import java.util.concurrent.CountDownLatch;

/**
 * <p> 等人都到齐了再开饭 </p>
 *
 * @author : tianpengfei
 * @version :  CountDownLatchTest2.java,v 1.0, 2019/10/8-16:18 tianpengfei Exp $
 */
public class CountDownLatchTest2 {
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch countDownLatch = new CountDownLatch(8);
		for (int i = 1; i <=8; i++) {
			new Thread(() -> {
				System.out.println("第  个人到了。");
				countDownLatch.countDown();
			}).start();
		}
		countDownLatch.await();
		System.out.println("=====================");
	}
}
