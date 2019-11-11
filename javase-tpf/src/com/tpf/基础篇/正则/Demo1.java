package com.tpf.基础篇.正则;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  Demo1.java,v 1.0, 2019/3/26-11:09 tianpengfei Exp $
 */
public class Demo1 {

	public static void main(String[] args) {
		String str = "fgjjf34281g6486668jfd12wrj23iojr";
		//将字符串中的数组替换为#
		replaceAllDemo(str, "\\d{5,}", "#");

		//将重叠的字符替换为单个字符
		String str1 = "fhsjfahhfaskkfdaaaefdsf";
		replaceAllDemo(str1, "(.)\\1+", "$1");
	}

	public static void replaceAllDemo(String str, String reg, String newStr) {
		str = str.replaceAll(reg, newStr);
		System.out.println(str);
	}

}
