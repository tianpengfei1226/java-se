package com.tpf.designpattern.代理模式.田鹏飞.mybatis;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  MainTest.java,v 1.0, 2019/3/5-17:45 tianpengfei Exp $
 */
public class MainTest {
	public static void main(String[] args) {
		MyMapperProxyFactory mapperProxyFactory = new MyMapperProxyFactory(UserDao.class);
		System.out.println(">> " + mapperProxyFactory);

		UserDao o = (UserDao) mapperProxyFactory.newInstance(new MySqlSession());
		System.out.println(o);
		o.queryUsers();
	}
}
