package com.tpf.dateformat;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * <p> DateFormat 学习</p>
 * 1、内部结构
 * DateFormat的作用是格式化Date；帮助我们将Date转换成我们需要的String字符串。
 * DateFormat提供的功能非常有限，它只能支持FULL、LONG、MEDIUM 和 SHORT 这4种格式。
 * 而且，我们获取DateFormat实例时，实际上是返回的SimpleDateFormat对象。
 *
 * @author : tianpengfei
 * @version :  DateFormatTest.java,v 1.0, 2018/12/28-19:28 tianpengfei Exp $
 */
public class DateFormatTest {
	public static void main(String[] args) {
		// 只显示“时间”：调用getTimeInstance()函数
		testGetTimeInstance();

		// 只显示“日期”：调用getDateInstance()函数
		testGetDateInstance();

		// 显示“日期”+“时间”：调用getDateTimeInstance()函数
		testGetDateTimeInstance();
		
		// 测试format()函数
		testFormat();
	}

	private static void testGetTimeInstance() {
		Date date = new Date();
		Locale local = new Locale("zh", "CN");

		DateFormat format0 = DateFormat.getTimeInstance();

		System.out.println(format0.format(date));

		DateFormat full0  = DateFormat.getTimeInstance(DateFormat.FULL);
		DateFormat long1  = DateFormat.getTimeInstance(DateFormat.LONG);
		DateFormat medium2  = DateFormat.getTimeInstance(DateFormat.MEDIUM);
		DateFormat short3  = DateFormat.getTimeInstance(DateFormat.SHORT);

		System.out.println(full0.format(date));
		System.out.println(long1.format(date));
		System.out.println(medium2.format(date));
		System.out.println(short3.format(date));

	}

	private static void testGetDateInstance() {
	}

	private static void testGetDateTimeInstance() {
	}

	private static void testFormat() {
	}

}
