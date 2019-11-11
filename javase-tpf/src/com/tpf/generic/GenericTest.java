package com.tpf.generic;

import java.util.Arrays;
import java.util.List;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  GenericTest.java,v 1.0, 2019/10/31-17:37 tianpengfei Exp $
 */
public class GenericTest {
	public static <T extends Comparable<T>>List<T> sort(List<T> list) {
		return Arrays.asList( list.toArray( (T[]) new Comparable[list.size()] ) );
	}
}
