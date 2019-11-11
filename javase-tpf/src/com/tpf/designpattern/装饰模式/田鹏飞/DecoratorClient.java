package com.tpf.designpattern.装饰模式.田鹏飞;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  DecoratorClient.java,v 1.0, 2019/9/19-10:21 tianpengfei Exp $
 */
public class DecoratorClient {
	public static void main(String[] args) {
		Component component = new DefaultComponent();

		DecoratorImplA decorator = new DecoratorImplA(component);

		decorator.process();

	}
}
