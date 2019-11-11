package com.tpf.designpattern.装饰模式.田鹏飞;

/**
 * <p> 抽象装饰器 </p>
 *
 * @author : tianpengfei
 * @version :  AbstractDecorator.java,v 1.0, 2019/9/19-10:15 tianpengfei Exp $
 */
public abstract class AbstractDecorator implements Component {

	protected Component component;

	public AbstractDecorator(Component component) {
		this.component = component;
	}

	@Override
	public void process() {
		component.process();
	}
}
