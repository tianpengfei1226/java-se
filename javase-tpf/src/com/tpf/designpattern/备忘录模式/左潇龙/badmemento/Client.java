package com.tpf.designpattern.备忘录模式.左潇龙.badmemento;

/**
 * <p> 定义：在不破坏封闭的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态。</p>
 *
 * @author : tianpengfei
 * @version :  DecoratorClient.java,v 1.0, 2018/11/16-10:07 tianpengfei Exp $
 */
public class Client {
	public static void main(String[] args) {
		Person personA = new Person("看守所人员A");
		Person personB = new Person("看守所人员B");
		// 看守所人员A的记忆
		personA.addStory("小时候偷换男女厕所的牌子");
		personA.addStory("用裤衩上的猴皮筋做成弹弓打别人家玻璃，结果被弹了小JJ");

		// 看守所人员B的记忆
		personB.addStory("小时候比谁尿的更高更远，我得了第一，只是不小心方向变成了直上直下，尿到了自己脸上");
		personB.addStory("有一次正上课，不小心放了个屁，结果带出了点杂物，满教室都是臭味熏天");

		// 两个看守所人员一起经历的事
		personA.addStory("有一个人竟然可以飞行，记忆中还记得他的样貌");
		personB.addStory("有一个人竟然可以飞行，记忆中还记得他的样貌");

		System.out.println(personA);
		System.out.println(personB);
	}
}
