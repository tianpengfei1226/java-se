package com.tpf.designpattern.命令模式.左潇龙.gooddemo;

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

	public void putDemand(ProductManager productManager, Programmer programmer) {
		System.out.println("业务员" + name + "提出新需求");
		productManager.receive(new Demand(programmer));
	}

	public void putBug(ProductManager productManager, Programmer programmer) {
		System.out.println("业务员" + name + "提出bug");
		productManager.receive(new Bug(programmer));
	}

	public void putProblem(ProductManager productManager, Programmer programmer) {
		System.out.println("业务员" + name + "提出线上问题");
		productManager.receive(new Problem(programmer));
	}
}
