package com.tpf.designpattern.代理模式.田鹏飞.代理实现数据库连接池;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  DataSource.java,v 1.0, 2018/10/22-9:58 tianpengfei Exp $
 */
public class DataSource {
	/**
	 * 声明数据库链接池
	 */
	private static LinkedList<Connection> pool = new LinkedList<Connection>();

	// 加载数据库驱动
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	/**
	 * 创建链接
	 * @return
	 * @throws SQLException
	 */
	private static Connection createNewConnection() throws SQLException {
		String url = "jdbc:mysql:///db909?characterEncoding=UTF8";
		return DriverManager.getConnection(url, "root", "root");
	}

	private DataSource(){
		try {
			for (int i = 0; i < 3; i++) {

				// 获取代理的连接池
				Connection proxyConn = new ConnProxy(createNewConnection(), pool).getInstance();

				// 一定要将代理对象添加到池中去。
				pool.add((Connection) proxyConn);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}



	public static Connection getConn() {
		synchronized (pool) {
			if (pool.size() == 0) {
				try {
					pool.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				return getConn();
			}
			return pool.removeFirst();
		}
	}

	public static DataSource getInstance(){
		return HolderInstance.instance;
	}

	private static class HolderInstance {
		private final static DataSource instance = new DataSource();
	}

}
