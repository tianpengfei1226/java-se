package com.tpf.java8.lambda;

/**
 * <p> </p >
 *
 * @author : tianpf
 * @version :  Student.java,v 1.0, 2020/8/21-9:44 tianpengfei Exp $
 */
public class Student {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
