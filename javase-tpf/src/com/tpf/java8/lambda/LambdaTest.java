package com.tpf.java8.lambda;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * <p> </p >
 *
 * @author : tianpf
 * @version :  LambdaTest.java,v 1.0, 2020/8/21-9:45 tianpengfei Exp $
 */
public class LambdaTest {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x > 29;
        Student student = new Student(30, "zhangsan");
        System.out.println(predicate.test(student.getAge()));

        Consumer<String> consumer = System.out::println;

        test(() -> "hahahah");
    }

    public static void test(MyInf inf) {
//        String test = inf.test();
        String test = inf.get();
        System.out.println(test);
    }
}

interface MyInf extends Supplier<String> {
//    String test();
}
