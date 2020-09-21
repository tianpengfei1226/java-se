package com.tpf.thread.线程池.自定义线程池彤哥;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p> </p >
 *
 * @author : tianpf
 * @version :  MyThreadPoolExecutorTest.java,v 1.0, 2020/8/13-19:46 Exp $
 */
public class MyThreadPoolExecutorTest {
    public static void main(String[] args) {

        MyExecutor myExecutor = new MyThreadPoolExecutor(
                "test",
                5,
                10,
                new ArrayBlockingQueue<>(15),
                new MyDiscardRejectPolicy());
        AtomicInteger num = new AtomicInteger(0);
        for (int i = 0; i < 100; i++) {

            myExecutor.execute(() -> {
                try {
                    Thread.sleep(1000);
                    System.out.println("running: " + System.currentTimeMillis() + ": " + num.incrementAndGet());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

        }
    }
}

