package com.tpf.designpattern.回调.烧水例子;

import java.util.concurrent.FutureTask;

/**
 * <p> </p>
 *a.加入适量的水
 b.打开煤气
 c.playGame // 打一局小游戏
 d.主动提醒，水已烧开 —- //主动通知-回调
 e.关闭煤气
 * @author : tianpengfei
 * @version :  异步执行异步回调.java,v 1.0, 2019/7/31-10:38 tianpengfei Exp $
 */
public class 异步执行异步回调 extends AbstractBoilWater {
	@Override
	public void make() throws Exception {
		a_addWater();
		b_on();
		FutureTask<Integer> futureTask = new FutureTask(() -> {
			c_boiling();
			return 1;
		}) {
			//当futureTask执行完之后,调用done()
			@Override
			protected void done() {
				d_off();
			}
		};

		new Thread(futureTask).start();
		while (!futureTask.isDone()) {
			playGame();
		}

		Thread.sleep(5000);
	}

}
