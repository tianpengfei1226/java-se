package com.tpf.designpattern.回调.烧水例子;

import java.util.concurrent.CompletableFuture;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  异步执行异步回调2.java,v 1.0, 2019/7/31-10:41 tianpengfei Exp $
 */
public class 异步执行异步回调2 extends AbstractBoilWater {
	@Override
	public void make() throws Exception {
		a_addWater();
		b_on();
		CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
			try {
				c_boiling();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return 1;
		});

		//注册事件“监听”
		future.whenComplete((v, e) -> {
			d_off();
		});

		while (!future.isDone()) {
			playGame();
		}
	}

}
