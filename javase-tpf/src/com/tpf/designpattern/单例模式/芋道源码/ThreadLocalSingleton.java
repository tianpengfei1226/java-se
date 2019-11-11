package com.tpf.designpattern.单例模式.芋道源码;

/**
 * <p> 使用ThreadLocal实现单例模式 </p>
 * ThreadLocal会为每一个线程提供一个独立的变量副本，从而隔离了多个线程对数据的访问冲突。
 * 对于多线程资源共享的问题，同步机制采用了“以时间换空间”的方式，而ThreadLocal采用了“以空间换时间”的方式。
 * 前者仅提供一份变量，让不同的线程排队访问，而后者为每一个线程都提供了一份变量，因此可以同时访问而互不影响。
 *
 * @author : tianpengfei
 * @version :  ThreadLocalSingleton.java,v 1.0, 2019/1/8-10:56 tianpengfei Exp $
 */
public class ThreadLocalSingleton {
	private static final ThreadLocal<ThreadLocalSingleton> tlSingleton = new ThreadLocal<ThreadLocalSingleton>() {
		@Override
		protected ThreadLocalSingleton initialValue() {
			return new ThreadLocalSingleton();
		}
	};

	public static ThreadLocalSingleton getInstance() {
		return tlSingleton.get();
	}

	private ThreadLocalSingleton() {
	}
}
