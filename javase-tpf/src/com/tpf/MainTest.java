package com.tpf;

import java.util.Date;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  MainTest.java,v 1.0, 2018/11/12-9:58 tianpengfei Exp $
 */
public class MainTest {
	public static void main(String[] args) throws Exception {
		String s = "中国工商银行股份有限公司北京市分行房山支行政通路分理处";
		System.out.println(s.length());
		System.out.println(s.getBytes().length);
		System.out.println(s.getBytes("UTF-8").length);
		System.out.println(s.getBytes("GBK").length);
		System.out.println(s.getBytes("ISO8859-1").length);
		System.out.println(201488/1000);

		Date date1 = new Date();
		date1.setTime(1543266000000L);
		System.out.println(date1);
		Date date2 = new Date();
		date2.setTime(1543352400000L);
		System.out.println(date2);


		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = "abc";
		System.out.println("=======================");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println("11".equals("11"));
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));

		System.out.println(str1);



	}
}
