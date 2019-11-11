package com.tpf.designpattern.命令模式.左潇龙.gooddemo;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  FinalClient.java,v 1.0, 2018/10/15-18:13 tianpengfei Exp $
 */
public class GoodClient {

	public static void main(String[] args) {
		Programmer xiaozuo = new Programmer("小左");

		ProductManager productManager = new ProductManager();

		Salesman salesmanA = new Salesman("A");
		Salesman salesmanB = new Salesman("B");
		Salesman salesmanC = new Salesman("C");
		Salesman salesmanD = new Salesman("D");

		salesmanA.putDemand(productManager, xiaozuo);
		salesmanB.putDemand(productManager, xiaozuo);
		salesmanB.putBug(productManager, xiaozuo);
		salesmanC.putDemand(productManager, xiaozuo);
		salesmanC.putProblem(productManager, xiaozuo);
		salesmanD.putDemand(productManager, xiaozuo);

		System.out.println("第一天产品经理分配任务");
		productManager.assign();
		productManager.printTaskList();
		System.out.println("第二天产品经理分配任务");
		productManager.assign();
		productManager.printTaskList();
	}
}
