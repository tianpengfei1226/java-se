package com.tpf.designpattern.回调.烧水例子;

/**
 * <p> https://blog.csdn.net/it_freshman/article/details/80580369 </p>
 *
 * @author : tianpengfei
 * @version :  AbstractBoilWater.java,v 1.0, 2019/7/31-10:23 tianpengfei Exp $
 *
 * 业务场景
假定我们有这样一个业务场景，烧一壶开水，烧一壶开水有如下几个步骤：

加水
打开煤气
烧水ing—(比较耗时的动作)
观察，烧水完成
最后水开之后，关闭煤气
 */
public abstract class AbstractBoilWater {
	protected volatile boolean isReadyFlag = false;

	protected void a_addWater() {
		System.out.println("1.加水");
	}

	protected void b_on() {
		System.out.println("2.打开煤气");
	}

	protected void c_boiling() throws Exception {
		System.out.println("3-1.烧水中.....");
		//模拟烧水的过程，比较耗时
		Thread.sleep(5000);
		System.out.println("3-2.水开了");
		isReadyFlag = true;
	}

	protected void d_off() {
		System.out.println("4.关闭煤气");
	}

	//烧水方法
	public abstract void make() throws Exception;

	protected void playGame() throws Exception {
		Thread.sleep(500);
		if (!isReadyFlag) {
			System.out.println("水还没烧开,玩一把游戏");
		}
	}

}
