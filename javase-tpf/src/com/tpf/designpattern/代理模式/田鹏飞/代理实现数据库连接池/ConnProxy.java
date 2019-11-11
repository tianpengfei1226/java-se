package com.tpf.designpattern.代理模式.田鹏飞.代理实现数据库连接池;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.util.LinkedList;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  ConnProxy.java,v 1.0, 2018/10/22-9:47 tianpengfei Exp $
 */
public class ConnProxy implements InvocationHandler {
	private Connection conn;
	private LinkedList<Connection> pool;

	public ConnProxy(Connection conn, LinkedList<Connection> pool) {
		this.conn = conn;
		this.pool = pool;
	}

	public Connection getInstance() {
		return (Connection) Proxy.newProxyInstance(
				ConnProxy.class.getClassLoader(),
				new Class[]{Connection.class},
				this
		);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if ("close".equals(method.getName())) {
			System.out.println("不能关，还链接。。。。。"+ Thread.currentThread().getName());
			synchronized (pool) {
				pool.addLast((Connection) proxy);
				pool.notify();
			}
		} else {
			return method.invoke(conn, args);
		}
		return null;
	}
}
