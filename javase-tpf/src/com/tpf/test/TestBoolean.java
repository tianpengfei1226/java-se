package com.tpf.test;

/**
 * <p> </p>
 *
 * @version :  TestBoolean.java,v 1.0, 2018/6/8-16:29 tianpengfei Exp $
 * @auther : tianpengfei
 */
public class TestBoolean {
    static boolean yesOrNo(String s) {
        s = s.toLowerCase();
        if (s.equals("yes") || s.equals("y") || s.equals("t")) {
            s = "true";
        }
        System.out.println(">>> : " + s);
        boolean aBoolean = Boolean.getBoolean(s);
        System.out.println("> " + aBoolean);
        return aBoolean;
    }

    public static void main(String[] args) {
//        System.out.println(yesOrNo("true") + " , " + yesOrNo("Yes"));
        int capacity = 1;
        while (capacity < 16) {
            capacity <<= 1;
        System.out.println(capacity);

        }

        System.out.println(capacity * 0.75);
        Tpf t []  = new Tpf[10];
        System.out.println(t.length);

        // 取模测试
        int a = 123;
        int length = 16;
        System.out.println(a%length);
        System.out.println(a & length);



    }

    class Tpf{

    }

}
