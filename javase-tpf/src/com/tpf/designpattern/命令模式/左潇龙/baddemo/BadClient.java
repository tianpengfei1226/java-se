package com.tpf.designpattern.命令模式.左潇龙.baddemo;

/**
 * <p> </p>
 * 1，业务员和自己的耦合度太高，导致每个业务人员都可以直接命令自己，这导致自己心里很不爽。
 *
 * 2，由于自己本身只是个程序猿，所以自己对公司的业务并不是特别擅长，很难给任务制定优先级，给任务排序，自己所擅长的还是码代码，
 * 结果造成的后果就是经常按时完成了一个不重要的任务，但不小心却将很重要的任务向后推迟了，如果业务人员告状，自己可能就要挨批。
 * 可是这么多业务人员提问题，到底谁轻谁重，我哪知道。
 *
 * 3，如果任务堆积过多的时候，自己有时会忘记其中的一个甚至几个，人毕竟精力有限，如果任务多了，难免会出现这种情况，
 * 结果有的业务人员就直接告状到老板那里，实在是憋屈。
 *
 * 4，由于任务是随即产生的，业务人员什么时候想到任务就随时给自己，所以没有一个整体的规划，很容易导致自己加班。
 *
 * @author : tianpengfei
 * @version :  BadClient.java,v 1.0, 2018/10/15-17:51 tianpengfei Exp $
 */
public class BadClient {
	public static void main(String[] args) {
		Programmer xiaozuo = new Programmer("小左");

		Salesman salesmanA = new Salesman("A");
		salesmanA.putDemand(xiaozuo);

		Salesman salesmanB = new Salesman("B");
		salesmanB.putDemand(xiaozuo);

		Salesman salesmanC = new Salesman("C");
		salesmanC.putBug(xiaozuo);

		Salesman salesmanD = new Salesman("D");
		salesmanD.putProblem(xiaozuo);
	}
}
