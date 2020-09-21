package com.tpf.thread.线程池.自定义线程池彤哥;

/**
 * <p> </p >
 *
 * @author : tianpf
 * @version :  MyDiscardRejectPolicy.java,v 1.0, 2020/8/13-19:22 Exp $
 */
public class MyDiscardRejectPolicy implements MyRejectPolicy {
    @Override
    public void reject(Runnable task, MyThreadPoolExecutor myThreadPoolExecutor) {
        System.out.println("discard one task");
    }
}
