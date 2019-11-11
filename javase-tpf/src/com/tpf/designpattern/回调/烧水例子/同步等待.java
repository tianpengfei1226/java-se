package com.tpf.designpattern.回调.烧水例子;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  同步等待.java,v 1.0, 2019/7/31-10:24 tianpengfei Exp $
 */
public class 同步等待 extends AbstractBoilWater{
	@Override
	public void make() throws Exception {
		a_addWater();
		b_on();
		c_boiling();//同步阻塞等待
		d_off();
	}

}
