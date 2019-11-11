package com.tpf.netty.util;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  CalculatorUtil.java,v 1.0, 2019/3/6-16:32 tianpengfei Exp $
 */
public class CalculatorUtil {
	private final static ScriptEngine jse = new ScriptEngineManager().getEngineByName("JavaScript");
	public static Object cal(String expression){
		try {
			return jse.eval(expression);
		} catch (ScriptException e) {
			e.printStackTrace();
		}
		return null;
	}
}
