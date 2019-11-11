package com.tpf.test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

/**
 * <p> </p>
 *
 * @version :  MyEntryTest.java,v 1.0, 2018/6/8-18:05 tianpengfei Exp $
 * @auther : tianpengfei
 */
public class MyEntryTest {

    public static void main(String[] args) {
       /* MyEntry[] table = new MyEntry[16];

        for (int i = 0; i < 5; i++) {
            String key = "key_" + i;
            String v = "value_" + i;
            int bucketIndex = new Random().nextInt(16);

            MyEntry<String, String> e = table[bucketIndex];

            int h = e == null ? 123 : e.hashCode();
            table[bucketIndex] = new MyEntry(key, v, e, h);
            System.out.println(table);

        }
        System.out.println(table);*/
        Map<String, String> map = new HashMap<String, String>();
        for (int i=0; i<20; i++) {
            String key ="key_" +i;
            String value = "value_" + i;
            map.put(key, value);
        }
        System.out.println(map);

        BigDecimal salary = new BigDecimal(15000.00);
        BigDecimal bili = new BigDecimal(0.05);
        for (int i = 1; i <= 30; i++) {
            BigDecimal tmp = salary.multiply(bili).setScale(2, RoundingMode.HALF_UP);
            salary = salary.add(tmp);
            System.out.println("第 " + i + " 年是： " + salary);
        }
        System.out.println("30年后：" + salary);
    }
}
