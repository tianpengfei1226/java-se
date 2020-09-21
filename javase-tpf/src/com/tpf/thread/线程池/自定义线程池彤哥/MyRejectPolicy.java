package com.tpf.thread.线程池.自定义线程池彤哥;

/**
 * <p> </p >
 *
 * @author : tianpf
 * @version :  MyRejectPolicy.java,v 1.0, 2020/8/13-19:21 Exp $
 */
public interface MyRejectPolicy {
    /**
     * 拒绝方法
     *
     * @param task
     * @param myThreadPoolExecutor
     */
    void reject(Runnable task, MyThreadPoolExecutor myThreadPoolExecutor);
}
