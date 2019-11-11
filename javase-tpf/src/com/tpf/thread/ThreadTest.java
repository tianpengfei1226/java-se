package com.tpf.thread;

import java.util.concurrent.*;

/**
 * <p> </p>
 * 假如有Thread1、Thread2、Thread3、Thread4四条线程分别统计C、D、E、F四个盘的大小，所有线程都统计完毕交给Thread5线程去做汇总，应当如何实现？
 * @author : tianpengfei
 * @version :  ThreadTest.java,v 1.0, 2019/10/30-14:51 tianpengfei Exp $
 */
public class ThreadTest {
	public static void main(String[] args) {
		ThreadCount count;
		ExecutorService executor = Executors.newCachedThreadPool();
		CompletionService<Integer> service = new ExecutorCompletionService(executor);
		for (int i = 0; i < 4; i++) {
			count = new ThreadCount(i+1);
			service.submit(count);
		}

		// 添加结束，及时shutdown，不然主线程不会结束
		executor.shutdown();

		int total = 0;
		for (int i = 0; i < 4; i++) {
			try {
				total += service.take().get();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}

		System.out.println("=============");
		System.out.println(Thread.currentThread().getName() + " " + total);
	}
}

class ThreadCount implements Callable{
	private int type;

	public ThreadCount(int type) {
		this.type = type;
	}

	@Override
	public Object call() throws Exception {
		if(type==1){
			System.out.println(Thread.currentThread().getName() + " C盘统计大小");
			return 1;
		}else if(type==2){
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + " D盘统计大小");
			return 2;
		}else if(type==3){
			System.out.println(Thread.currentThread().getName() + " E盘统计大小");
			return 3;
		}else if(type==4){
			System.out.println(Thread.currentThread().getName() + " F盘统计大小");
			return 4;
		}
		return null;
	}
}
