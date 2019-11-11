package com.tpf.designpattern.装饰模式.田鹏飞;

/**
 * <p> 被装饰的原始类 </p>
 *
 * @author : tianpengfei
 * @version :  DefaultComponent.java,v 1.0, 2019/9/19-10:13 tianpengfei Exp $
 */
public class DefaultComponent implements Component {
	@Override
	public void process() {
		System.out.println("被装饰的原始类------process");
	}
}
