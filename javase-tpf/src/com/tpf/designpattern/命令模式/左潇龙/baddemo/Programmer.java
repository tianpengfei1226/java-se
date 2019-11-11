package com.tpf.designpattern.命令模式.左潇龙.baddemo;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  Programmer.java,v 1.0, 2018/10/15-17:48 tianpengfei Exp $
 */
public class Programmer {

	private String name;

	public Programmer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void handleDemand() {
		System.out.println(name + "处理新需求");
	}

	public void handleBug() {
		System.out.println(name + "处理bug");
	}

	public void handleProblem() {
		System.out.println(name + "处理线上问题");
	}

}
