package com.tpf.designpattern.代理模式.田鹏飞.代理实现数据库连接池;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  ThreadDemo.java,v 1.0, 2018/10/22-10:19 tianpengfei Exp $
 */
public class ThreadDemo {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			final int finalI = i;
			new Thread(new Runnable() {
				@Override
				public void run() {
					Connection con = null;
					try {
						con = DataSource2.getConn();
						System.err.println(Thread.currentThread().getName() + "," + con);
						//设置事务的开始
						con.setAutoCommit(false);
						String name = "Tom_" + finalI;
						String sql = "insert into users values('"+name+"', '44', '" + Thread.currentThread().getName() + "')";
						Statement st = con.createStatement();
						st.execute(sql);
						con.commit();
						System.err.println(Thread.currentThread().getName() + "子线程执行完成。。。。。");
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						try {
//							con.setAutoCommit(true);
							con.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}
			}).start();
		}
	}
}
