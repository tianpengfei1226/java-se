package com.tpf.designpattern.备忘录模式.左潇龙.goodmemento;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  Soul.java,v 1.0, 2018/11/16-10:43 tianpengfei Exp $
 */
public class Soul {

	private Memory memory;

	/**
	 * 抽离或者说搜集一个人的记忆
	 *
	 * @param person
	 */
	public void pullAwayMemory(Person person) {
		memory = person.getMemory();
	}

	/**
	 * 强行将一个人的记忆固定在某一刻
	 *
	 * @param person
	 */
	public void forceFixMemory(Person person) {
		person.setMemory(memory);
	}

}
