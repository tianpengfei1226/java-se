package com.tpf.juc.unsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  InstantialTest.java,v 1.0, 2019/9/25-15:01 tianpengfei Exp $
 */
public class InstantialTest {

	private static Unsafe unsafe;

	static {
		try {
			Field f = Unsafe.class.getDeclaredField("theUnsafe");
			f.setAccessible(true);
			try {
				unsafe = (Unsafe) f.get(null);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InstantiationException {

// 1. 构造方法
		Person person1 = new Person(20);

//
//// 2. Class，里面实际也是反射
//		Person person2 = Person. class.newInstance();
//
//
//// 3. 反射

//
//// 4. 克隆

// 5. 反序列化
//Person person5 = unserialize(person1);

// 6. Unsafe
		Person person6 = (Person) unsafe.allocateInstance(Person.class);

		System.out.println(person6.getAge());
	}

}
