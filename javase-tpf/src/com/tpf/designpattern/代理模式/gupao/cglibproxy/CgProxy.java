package com.tpf.designpattern.代理模式.gupao.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * <p> 使用cglib创建的代理对象 </p>
 *
 * @author : tianpengfei
 * @version :  CgProxy.java,v 1.0, 2018/10/14-13:03 tianpengfei Exp $
 */
public class CgProxy implements MethodInterceptor {

	private Object targetObj;

	public CgProxy(Object targetObj) {
		this.targetObj = targetObj;
	}

	public <T>T getInstance(T t) throws Exception {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(t.getClass());
		enhancer.setCallback(new CgProxy(t));
		return (T) enhancer.create();
	}

	// 和jdk动态代理一样是实现字节码重组
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//		method.invoke(targetObj, args);
		return null;
	}
}
