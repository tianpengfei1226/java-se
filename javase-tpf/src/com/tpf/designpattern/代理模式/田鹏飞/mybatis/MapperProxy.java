package com.tpf.designpattern.代理模式.田鹏飞.mybatis;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  MapperProxy.java,v 1.0, 2019/3/5-17:42 tianpengfei Exp $
 */
public class MapperProxy implements InvocationHandler {

	private static final long serialVersionUID = -6424540398559729838L;
	private final MySqlSession sqlSession;
	private final Class mapperInterface;

	public MapperProxy(MySqlSession sqlSession, Class mapperInterface) {
		this.sqlSession = sqlSession;
		this.mapperInterface = mapperInterface;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (method.getName().equals("queryUsers")){
			System.out.println("================");
		}
		return "asdfasdfasdfasdfs";
	}


}
