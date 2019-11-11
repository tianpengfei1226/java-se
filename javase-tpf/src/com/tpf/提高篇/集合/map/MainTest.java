package com.tpf.提高篇.集合.map;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  MainTest.java,v 1.0, 2019/7/31-15:07 tianpengfei Exp $
 */
public class MainTest {
	public static void main(String[] args) {
//		HashMap map = new HashMap();
//		map.put("123", "abc");
//
//		HashSet<String> set = new HashSet<String>();
//		Map<Object, Object> objectObjectMap = Collections.synchronizedMap(new HashMap<>());

		String t = "tpf";
		String t2 = "tpf";
		String tt = new String ("tpf");
		String ttt = new String ("tpf");

		System.out.println(t.equals(tt) );
		System.out.println( t== tt);
		System.out.println("-------------");
		System.out.println(t == t2);
		System.out.println("-------------");
		System.out.println(t.equals(ttt));
		System.out.println(t == ttt);
		System.out.println(tt == ttt);

	}
}
