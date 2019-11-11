package com.tpf.designpattern.代理模式.田鹏飞;

import java.lang.reflect.Method;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  DecoratorClient.java,v 1.0, 2018/10/16-10:35 tianpengfei Exp $
 */
public class Client {
	public static void main(String[] args) throws Exception {
		Tpf ttt = new Tpf("tianpengfei");
//		System.out.println("ttt " + ttt);
//		Object instance = new TpfProxy<Tpf>(ttt).getInstance();
//		System.out.println("instance " + instance.getClass().toString());
//
//		IPerson tpf = (IPerson) instance;
//		String ss = tpf.work("我写了个代理类");
//		System.out.println(ss);
//		System.out.println();
//		System.out.println("---------------------------------------");

//		Object instance2 = new TpfProxy<Tpf>(Tpf.class).getInstance();
//		IPerson tpf2 = (IPerson) instance2;
//		String ss2 = tpf2.work("我写了个代理类");
//		System.out.println(ss2);
//
//		Tpf t = new Tpf();
//		System.out.println(Tpf.class instanceof Type);
//		System.out.println(t instanceof Type);

		Class<?> aClass = Class.forName("com.tpf.designpattern.代理模式.田鹏飞.IPerson");
		Method work = aClass.getMethod("work", new Class[]{Class.forName("java.lang.String")});
		work.invoke(ttt, "1111111111111");
	}
}
