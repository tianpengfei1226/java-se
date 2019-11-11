package com.tpf.designpattern.命令模式.左潇龙.finaldemo;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  Bug.java,v 1.0, 2018/10/15-17:59 tianpengfei Exp $
 */
public class Bug implements Task {

	private Programmer programmer;

	public Bug(Programmer programmer) {
		this.programmer = programmer;
	}

	@Override
	public void handle() {
		programmer.handleBug();
	}

	@Override
	public String toString() {
		return "Bug{" +
				"programmer=" + programmer +
				'}';
	}
}
