package com.tpf.designpattern.观察者模式.事件驱动.田鹏飞;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  TestObserver.java,v 1.0, 2018/11/23-18:28 tianpengfei Exp $
 */
public class TestObserver {
	public static void main(String[] args) {
		//声明被观察者
		Person person = new Person();
		System.err.println("pp:"+person);
		person.addPersonListener(new PersonListener() {
			@Override
			public void tell(PersonEvent pe) {
				System.err.println("listener....."+pe.getSource());
			}
		});
		person.run();
	}
}

/**
 * 3、定义 被监听的对象
 */
class Person{

	/**
	 * 监听器
	 */
	private PersonListener pl;

	/**
	 * 给这个对象安装一个窃听器（监听器）
	 */
	public void addPersonListener(PersonListener pl){
		this.pl = pl;
	}

	public void run(){
		if(pl!=null){
			pl.tell(new PersonEvent(this));
		}
		System.err.println("dadianhua......");
	}
}

/**
 * 2、定义 监听器
 */
interface PersonListener{
	/**
	 *
	 * @param pe
	 */
	void tell(PersonEvent pe);
}

/**
 * 1、定义 事件源
 */
class PersonEvent{
	private Object src;
	public PersonEvent(Object obj) {
		this.src=obj;
	}
	public Object getSource(){
		return src;
	}
}


