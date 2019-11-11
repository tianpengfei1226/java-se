package com.tpf.designpattern;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * <p> </p>
 *
 * @version :  BadClient.java,v 1.0, 2018/9/21-17:44 tianpengfei Exp $
 * @auther : tianpengfei
 */
public class Client {

	public static void main(String[] args) {
		isValidLongDateFormat("201810141520");


		String s = "121212121";
		if (!s.matches("\\d+")) {
			System.out.println("111111111111111111111");
		} else {
			System.out.println("22222222222222");
		}
	}

	public static boolean isValidLongDateFormat(String strDate) {
		if (strDate.length() != "yyyyMMddHHmmss".length()) {
			return false;
		} else {
			try {
				Long.parseLong(strDate);
			} catch (Exception var4) {
				return false;
			}

			DateFormat df = getNewDateFormat("yyyyMMddHHmmss");

			try {
				df.parse(strDate);
				return true;
			} catch (ParseException var3) {
				return false;
			}
		}
	}
	public static DateFormat getNewDateFormat(String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		df.setLenient(false);
		return df;
	}
}
