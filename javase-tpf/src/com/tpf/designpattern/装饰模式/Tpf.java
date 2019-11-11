package com.tpf.designpattern.装饰模式;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  Tpf.java,v 1.0, 2018/10/29-15:41 tianpengfei Exp $
 */
public class Tpf {
	IPerson person;

	public Tpf(IPerson person) {
		this.person = person;
	}

	void aaa(){
		person.eat();
	}
}
