package com.tpf.designpattern.命令模式.左潇龙.finaldemo;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  Salesman.java,v 1.0, 2018/10/15-17:49 tianpengfei Exp $
 */
public class Salesman {
	private String name;

	private ProductManager productManager;


	public Salesman(String name, ProductManager productManager) {
		super();
		this.name = name;
		this.productManager = productManager;
	}

	public String getName() {
		return name;
	}

	public void putDemand() {
		System.out.println("业务员" + name + "提出新需求");
		productManager.receive(new Demand(productManager.chooseProgrammer()));
	}

	public void putBug() {
		System.out.println("业务员" + name + "提出bug");
		productManager.receive(new Bug(productManager.chooseProgrammer()));
	}

	public void putProblem() {
		System.out.println("业务员" + name + "提出线上问题");
		productManager.receive(new Problem(productManager.chooseProgrammer()));
	}
}
