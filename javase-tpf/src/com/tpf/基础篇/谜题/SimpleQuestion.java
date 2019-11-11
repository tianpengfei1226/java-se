package com.tpf.基础篇.谜题;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  SimpleQuestion.java,v 1.0, 2019/7/31-14:38 tianpengfei Exp $
 */
public class SimpleQuestion {

	static boolean yesOrNo(String s) {
		s = s.toLowerCase();
		if (s.equals("yes") || s.equals("y") || s.equals("t")) {
			s = "true";
		}
		System.out.println(">>>> " + s);
		return Boolean.getBoolean(s);
	}

	public static void main(String[] args) {
		System.out.println(yesOrNo("true") + "" + yesOrNo("Yes"));
	}

}
