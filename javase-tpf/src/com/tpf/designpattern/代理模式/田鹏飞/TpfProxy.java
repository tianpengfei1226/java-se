package com.tpf.designpattern.代理模式.田鹏飞;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  TpfProxy.java,v 1.0, 2018/10/15-11:19 tianpengfei Exp $
 */
public class TpfProxy<T> implements InvocationHandler {

	private Object targetObj;
	private Class<T> targetClazz;

	public TpfProxy(Class targetClazz) {
		this.targetClazz = targetClazz;
	}

	public TpfProxy(Object targetObj) {
		this.targetObj = targetObj;
	}

	public <T>T getInstance() {
		System.out.println("this " + this);
		return (T) Proxy.newProxyInstance(
				TpfProxy.class.getClassLoader(),
				targetObj == null ? targetClazz.getInterfaces() : targetObj.getClass().getInterfaces(),
				this
		);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("---------invoke  start-----------");
		Object result = method.invoke(targetObj == null ? targetClazz.newInstance() : targetObj, args);
		System.out.println("---------invoke  end-----------");
		return result;
	}
}
