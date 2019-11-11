package com.tpf.designpattern.命令模式.左潇龙.gooddemo;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  Problem.java,v 1.0, 2018/10/15-18:03 tianpengfei Exp $
 */
public class Problem implements Task {

	private Programmer programmer;

	public Problem(Programmer programmer) {
		this.programmer = programmer;
	}

	@Override
	public void handle() {
		programmer.handleProblem();
	}

	@Override
	public String toString() {
		return "Problem{" +
				"programmer=" + programmer +
				'}';
	}
}
