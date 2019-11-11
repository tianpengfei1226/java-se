package com.tpf.designpattern.原型模式.左潇龙;

/**
 * <p> 原型模式 </p>
 * 定义：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 *
 * @author : tianpengfei
 * @version :  Prototype.java,v 1.0, 2018/10/15-10:48 tianpengfei Exp $
 */
public class Prototype implements Cloneable {
	private int x;
	private int y;
	private int z;

	public Prototype() {
		System.out.println("Object.clone()方法去拷贝一个对象时，构造方法是不被执行的");
		this.x = 2;
		this.y = 3;
		this.z = 4;
	}

	public void change() {
		this.x = 9;
		this.y = 8;
		this.z = 7;
	}

	@Override
	public Prototype clone() {
		Object object = null;
		try {
			object = super.clone();
		} catch (CloneNotSupportedException exception) {
			throw new RuntimeException(exception);
		}
		return (Prototype) object;
	}

	@Override
	public String toString() {
		return "Prototype{" +
				"x=" + x +
				", y=" + y +
				", z=" + z +
				'}';
	}

	public static void main(String[] args) {
		Prototype p1 = new Prototype();
		p1.change();
		System.out.println(p1);
		Prototype p2 = p1.clone();
		System.out.println(p2);

	}
}
