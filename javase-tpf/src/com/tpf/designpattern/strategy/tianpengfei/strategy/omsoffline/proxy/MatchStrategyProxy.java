package com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.proxy;

import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.annotation.ValidRegion;
import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.common.OmsContents;
import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.domain.MatchProp;
import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.domain.OmsOrder;
import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.strategy.MatchStrategy;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p> 匹配策略代理 </p>
 *
 * @author : tianpengfei
 * @version :  MatchStrategyProxy.java,v 1.0, 2019/1/28-18:15 tianpengfei Exp $
 */
public class MatchStrategyProxy implements InvocationHandler {

	private Class<? extends MatchStrategy> clazz;

	private MatchStrategyProxy(Class<? extends MatchStrategy> clazz) {
		super();
		this.clazz = clazz;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		if (OmsContents.MATCH_METHOD.equals(method.getName())) {
			ValidRegion validRegion = handleAnnotation(clazz);
			MatchProp matchProp = ((OmsOrder) args[0]).getMatchProp();
			if (matchProp.getPropName().equals(validRegion.name())) {
				return method.invoke(clazz.newInstance(), args);
			}
		}
		return null;
	}

	private static ValidRegion handleAnnotation(Class<? extends MatchStrategy> clazz) {
		Annotation[] annotations = clazz.getDeclaredAnnotations();
		if (annotations == null || annotations.length == 0) {
			return null;
		}
		for (int i = 0; i < annotations.length; i++) {
			if (annotations[i] instanceof ValidRegion) {
				return (ValidRegion) annotations[i];
			}
		}
		return null;
	}

	public static MatchStrategy getProxy(Class<? extends MatchStrategy> clazz) {
		return (MatchStrategy) Proxy.newProxyInstance(
				MatchStrategyProxy.class.getClassLoader(),
				new Class<?>[]{MatchStrategy.class},
				new MatchStrategyProxy(clazz));
	}
}
