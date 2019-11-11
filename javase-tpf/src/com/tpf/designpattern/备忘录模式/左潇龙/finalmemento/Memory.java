package com.tpf.designpattern.备忘录模式.左潇龙.finalmemento;

import java.util.List;

/**
 * <p> 记忆类（备忘录）</p>
 *
 * @author : tianpengfei
 * @version :  Memory.java,v 1.0, 2018/11/16-10:40 tianpengfei Exp $
 */
public class Memory {
	private List<String> storyList;

	public List<String> getStoryList() {
		return storyList;
	}

	public void setStoryList(List<String> storyList) {
		this.storyList = storyList;
	}

}
