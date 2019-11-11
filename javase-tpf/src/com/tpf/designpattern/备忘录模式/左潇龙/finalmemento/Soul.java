package com.tpf.designpattern.备忘录模式.左潇龙.finalmemento;

import java.util.HashMap;
import java.util.Map;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  Soul.java,v 1.0, 2018/11/16-10:43 tianpengfei Exp $
 */
public class Soul {

	private Map<Person, Memory> memoryMap = new HashMap<Person, Memory>();


	/**
	 * 抽离或者说搜集一个人的记忆
	 *
	 * @param person
	 */
	public void pullAwayMemory(Person person) {
		memoryMap.put(person, person.getMemory());
	}

	/**
	 * 强行将一个人的记忆固定在某一刻
	 *
	 * @param person
	 */
	public void forceFixMemory(Person person) {
		if (memoryMap.containsKey(person)) {
			person.setMemory(memoryMap.get(person));
		}
	}

}
