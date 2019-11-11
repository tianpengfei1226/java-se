package com.tpf.designpattern.命令模式.左潇龙.finaldemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p> 产品经理类 </p>
 *
 * @author : tianpengfei
 * @version :  ProductManager.java,v 1.0, 2018/10/15-18:04 tianpengfei Exp $
 */
public class ProductManager {
	/**
	 * 一天最多分派掉四个任务，多了推到第二天
	 */
	private static final int TASK_NUMBER_IN_DAY = 4;

	private List<Task> taskList;

	/**
	 * 产品经理应该认识所有的程序猿
	 */
	private List<Programmer> programmerList;

	private int currentIndex;

	public ProductManager(Programmer... programmers) {
		super();
		if (programmers == null || programmers.length == 0) {
			throw new RuntimeException("产品经理手下没有程序员，任务分配不出去，无法正常工作！");
		}
		taskList = new ArrayList<Task>();
		programmerList = Arrays.asList(programmers);
	}

	/**
	 * 接受一个任务
	 *
	 * @param task 任务
	 */
	public void receive(Task task) {
		taskList.add(task);
	}

	/**
	 * 产品经理可以选择程序猿，简单的循环选取。
	 *
	 * @return
	 */
	public Programmer chooseProgrammer() {
		return programmerList.get(currentIndex == programmerList.size() ? 0 : currentIndex++);
	}

	/**
	 * 分配给程序猿任务，督促程序猿完成
	 */
	public void assign() {
		Task[] copy = new Task[taskList.size() > TASK_NUMBER_IN_DAY ? taskList.size() - TASK_NUMBER_IN_DAY : 0];
		for (int i = 0; i < TASK_NUMBER_IN_DAY && i < taskList.size(); i++) {
			taskList.get(i).handle();
		}
		System.arraycopy(taskList.toArray(), TASK_NUMBER_IN_DAY > taskList.size() ? taskList.size() : TASK_NUMBER_IN_DAY, copy, 0, copy.length);
		taskList = Arrays.asList(copy);
	}

	/**
	 * 打印剩下的任务
	 */
	public void printTaskList() {
		if (taskList == null || taskList.size() == 0) {
			System.out.println("----------当前无任务--------");
			return;
		}
		System.out.println("---------当前剩下的任务列表--------");
		for (Task task : taskList) {
			System.out.println(task);
		}
		System.out.println("----------------------------------");
	}

}
