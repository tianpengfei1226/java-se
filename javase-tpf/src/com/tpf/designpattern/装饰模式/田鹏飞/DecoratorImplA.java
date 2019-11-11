package com.tpf.designpattern.装饰模式.田鹏飞;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  DecoratorImplA.java,v 1.0, 2019/9/19-10:19 tianpengfei Exp $
 */
public class DecoratorImplA extends AbstractDecorator {

	public DecoratorImplA(Component component) {
		super(component);
	}

	@Override
	public void process() {
		System.out.println("装饰器A增强处理---开始");
		super.process();
		System.out.println("装饰器A增强处理---结束");
	}
}
