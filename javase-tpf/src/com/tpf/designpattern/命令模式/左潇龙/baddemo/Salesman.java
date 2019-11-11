package com.tpf.designpattern.命令模式.左潇龙.baddemo;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  Salesman.java,v 1.0, 2018/10/15-17:49 tianpengfei Exp $
 */
public class Salesman {
	private String name;

	public Salesman(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void putDemand(Programmer programmer) {
		System.out.println("业务员" + name + "提出新需求");
		programmer.handleDemand();
	}

	public void putBug(Programmer programmer) {
		System.out.println("业务员" + name + "提出bug");
		programmer.handleBug();
	}

	public void putProblem(Programmer programmer) {
		System.out.println("业务员" + name + "提出线上问题");
		programmer.handleProblem();
	}
}
