package com.tpf.thread.线程池.自定义线程池彤哥;

/**
 * <p> </p >
 *
 * @author : tianpf
 * @version :  MyExecutor.java,v 1.0, 2020/8/13-19:18 Exp $
 */
public interface MyExecutor {
    /**
     * 执行方法
     *
     * @param command
     */
    void execute(Runnable command);
}
