package com.tpf.juc;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  AtomicIntegerTest.java,v 1.0, 2019/2/28-12:46 tianpengfei Exp $
 */
public class AtomicIntegerTest {

	/**
	 * valatile的特点：
	 * 1、可见性
	 * 2、书序性
	 * <p>
	 * 3、no atomic
	 * <p>
	 */
	private static volatile int value;

	private static Set<Integer> set = Collections.synchronizedSet(new HashSet<Integer>());

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread() {
			@Override
			public void run() {
				int x = 0;
				while (x < 500) {
					set.add(value);
					int tmp = value;
					System.out.println(Thread.currentThread().getName() + " : " + tmp);
					value += 1;
					/**
					 * value += 1;
					 * (1) get value from main memory to local memory
					 * (2) add 1 => x
					 * (3) assign the value to x
					 * (4) flush to main memory
					 */
					x++;
				}
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				int x = 0;
				while (x < 500) {
					set.add(value);
					int tmp = value;
					System.out.println(Thread.currentThread().getName() + " : " + tmp);
					value += 1;
					x++;
				}
			}
		};

		Thread t3 = new Thread() {
			@Override
			public void run() {
				int x = 0;
				while (x < 500) {
					set.add(value);
					int tmp = value;
					System.out.println(Thread.currentThread().getName() + " : " + tmp);
					value += 1;
					x++;
				}
			}
		};

		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();

		System.out.println(set.size());

	}
}
