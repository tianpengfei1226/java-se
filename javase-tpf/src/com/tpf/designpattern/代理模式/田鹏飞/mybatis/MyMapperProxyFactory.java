package com.tpf.designpattern.代理模式.田鹏飞.mybatis;

import java.lang.reflect.Proxy;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  MyMapperProxyFactory.java,v 1.0, 2019/3/5-17:39 tianpengfei Exp $
 */
public class MyMapperProxyFactory {
	private final Class mapperInterface;
	public MyMapperProxyFactory(Class mapperInterface) {
		this.mapperInterface = mapperInterface;
	}

	public Object newInstance(MySqlSession sqlSession) {
		final MapperProxy mapperProxy = new MapperProxy(sqlSession, mapperInterface);
		return newInstance(mapperProxy);
	}

	private Object newInstance(MapperProxy mapperProxy) {
		return  Proxy.newProxyInstance(mapperInterface.getClassLoader(), new Class[] { mapperInterface }, mapperProxy);
	}
}
