package com.tpf.thread.线程池;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  RejectPolicy.java,v 1.0, 2019/10/22-16:57 tianpengfei Exp $
 */
public interface RejectPolicy {
	void reject(Runnable task, MyThreadPoolExecutor myThreadPoolExecutor);
}