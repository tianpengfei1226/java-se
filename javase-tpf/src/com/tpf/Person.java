package com.tpf;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  Person.java,v 1.0, 2019/9/20-10:16 tianpengfei Exp $
 */
public class Person {
	int age;
	String name ;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
