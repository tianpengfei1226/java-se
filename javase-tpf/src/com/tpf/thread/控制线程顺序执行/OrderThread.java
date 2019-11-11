package com.tpf.thread.控制线程顺序执行;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p> 多个线程有序执行 </p>
 *
 * @author : tianpengfei
 * @version :  OrderThread.java,v 1.0, 2019/9/26-16:02 tianpengfei Exp $
 */
public class OrderThread {

	static Thread thread1 = new Thread( () -> System.out.println("thread1") , "A");
	static Thread thread2 = new Thread( () -> System.out.println("thread2") , "b");
	static Thread thread3 = new Thread( () -> System.out.println("thread3") , "c");

	public static void main(String[] args) throws InterruptedException {
		// 方式一
//		thread1.start();
//		thread1.join();
//		thread2.start();
//		thread2.join();
//		thread3.start();

		// 方式二
		ExecutorService service = Executors.newSingleThreadExecutor();
		service.submit(thread1);
		service.submit(thread2);
		service.submit(thread3);

	}
}
