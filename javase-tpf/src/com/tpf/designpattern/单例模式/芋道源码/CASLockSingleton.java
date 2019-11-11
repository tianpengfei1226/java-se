package com.tpf.designpattern.单例模式.芋道源码;

import java.util.concurrent.atomic.AtomicReference;

/**
 * <p> 使用CAS锁实现 </p>
 * 更加优美的Singleton, 线程安全的
 *
 * @author : tianpengfei
 * @version :  CASLockSingleton.java,v 1.0, 2019/1/8-13:20 tianpengfei Exp $
 */
public class CASLockSingleton {

	/**
	 * 利用AtomicReference
	 */
	private static final AtomicReference<CASLockSingleton> INSTANCE = new AtomicReference<CASLockSingleton>();

	/**
	 * 私有化
	 */
	private CASLockSingleton() {
	}

	/**
	 * 用CAS确保线程安全
	 */
	public static final CASLockSingleton getInstance() {
		for (; ; ) {
			CASLockSingleton current = INSTANCE.get();
			if (current != null) {
				return current;
			}
			current = new CASLockSingleton();
			if (INSTANCE.compareAndSet(null, current)) {
				return current;
			}
		}
	}

	public static void main(String[] args) {
		CASLockSingleton singleton1 = CASLockSingleton.getInstance();
		CASLockSingleton singleton2 = CASLockSingleton.getInstance();
		System.out.println(singleton1 == singleton2);
	}
}
