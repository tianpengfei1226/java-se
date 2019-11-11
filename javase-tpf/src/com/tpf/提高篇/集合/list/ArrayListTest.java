package com.tpf.提高篇.集合.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  ArrayListTest.java,v 1.0, 2018/10/29-17:01 tianpengfei Exp $
 */
public class ArrayListTest {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(33);
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println("> " + list);
//			list.remove(0);
//			System.out.println(">> " + list);
//		}

		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println("-----------");
			Integer a =  iterator.next();
			if (a == 33) {
				//list.remove(a);
				aaa();
//				iterator.remove();
			}
			System.out.println(list);
		}

	}

	private static boolean aaa() {
		return true;
	}
}
