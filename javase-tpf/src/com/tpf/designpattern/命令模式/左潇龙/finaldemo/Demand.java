package com.tpf.designpattern.命令模式.左潇龙.finaldemo;

/**
 * <p> 需求 </p>
 *
 * @author : tianpengfei
 * @version :  Demand.java,v 1.0, 2018/10/15-17:57 tianpengfei Exp $
 */
public class Demand implements Task {
	private Programmer programmer;

	public Demand(Programmer programmer) {
		this.programmer = programmer;
	}

	@Override
	public void handle() {
		programmer.handleDemand();
	}

	@Override
	public String toString() {
		return "Demand{" +
				"programmer=" + programmer +
				'}';
	}
}
