package com.tpf.designpattern.代理模式.田鹏飞;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  Tpf.java,v 1.0, 2018/10/16-10:36 tianpengfei Exp $
 */
public class Tpf implements IPerson {

	private String name;

	public Tpf(String name) {
		this.name = name;
	}

	public Tpf() {
	}

	@Override
	public String work(String args) {
		System.out.println("working......  " + this.name);
		String s = "hello " + args;
		System.out.println("s >>> " + s);
		return s;
	}
}
