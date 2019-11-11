package com.tpf.designpattern.备忘录模式.左潇龙.badmemento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  Person.java,v 1.0, 2018/11/16-10:05 tianpengfei Exp $
 */
public class Person {

	private String name;

	//故事列表
	private List<String> storyList;

	public Person(String name) {
		this.name = name;
		storyList = new ArrayList<String>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 故事列表不能修改
	 *
	 * @return
	 */
	public List<String> getStoryList() {
		return Collections.unmodifiableList(storyList);
	}

	/**
	 * 可以添加，但不可以删除
	 *
	 * @param history
	 */
	public void addStory(String history) {
		this.storyList.add(history);
	}

	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer(name + "的记忆：\n");
		for (String memory : storyList) {
			stringBuffer.append(memory).append("\n");
		}
		return stringBuffer.toString();
	}
}
