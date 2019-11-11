package com.tpf.juc;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * <p> </p>
 * DelayQueue是java并发包下的延时阻塞队列，常用于实现定时任务。
 *
 * @author : tianpengfei
 * @version :  DelayQueueTest.java,v 1.0, 2019/10/29-14:47 tianpengfei Exp $
 */
public class DelayQueueTest {
	public static void main(String[] args) {

		System.out.println(8 >>> 1);
		System.out.println(8 >> 1);
		System.out.println("-----------------------");
		DelayQueue<Message> queue = new DelayQueue<Message>();

		long now = System.currentTimeMillis();
		// 启动一个线程从队列中取元素
		new Thread(() -> {
			while (true) {
				try {
					System.out.println(queue.take().deadline - now);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

		// 添加5个元素到队列中
		queue.add(new Message(now + 5000));
		queue.add(new Message(now + 8000));
		queue.add(new Message(now + 1000));
		queue.add(new Message(now + 3000));
		queue.add(new Message(now + 7000));
	}
}

class Message implements Delayed {
	long deadline;

	public Message(long deadline) {
		this.deadline = deadline;
	}

	@Override
	public long getDelay(TimeUnit unit) {
		return deadline - System.currentTimeMillis();
	}

	@Override
	public int compareTo(Delayed o) {
		return (int) (getDelay(TimeUnit.MILLISECONDS) - o.getDelay(TimeUnit.MILLISECONDS));
	}

	@Override
	public String toString() {
		return "Message{" +
				"deadline=" + deadline +
				'}';
	}
}