package com.tpf.generic;

import com.tpf.generic.bean.Parent;
import com.tpf.generic.bean.Son;

import java.util.ArrayList;
import java.util.List;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  GenericDemo.java,v 1.0, 2019/3/1-15:21 tianpengfei Exp $
 */
public class GenericDemo {
	public static void main(String[] args) {
		List<? extends Parent> list = new ArrayList<Parent>();

		// 编译报错
//		list.add(new Son());

		// 可以
		Son son = (Son) list.get(1);

	}
}
