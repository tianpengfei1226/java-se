package com.tpf.designpattern.回调.烧水例子;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * <p> </p>
 *
 *  a.加入适量的水
 - b.打开煤气 — 老鸟有一定的经验,目测20分钟之后可以烧开，
 - c.playGame// 打一局小游戏
 - d.观察水是否烧开烧开
 - e.关闭煤气

 * @author : tianpengfei
 * @version :  异步执行同步回调.java,v 1.0, 2019/7/31-10:27 tianpengfei Exp $
 */
public class 异步执行同步回调 extends AbstractBoilWater {
	@Override
	public void make() throws Exception {
		ExecutorService executor = Executors.newCachedThreadPool();
		a_addWater();
		b_on();
		Future<Integer> future = executor.submit(new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				c_boiling();
				return 1;
			}
		});
		executor.shutdown();
		while(!future.isDone()){
			playGame();//烧水过程中，玩一局游戏
		}
		int a = future.get(); //同步阻塞等待
		d_off();

	}
}
