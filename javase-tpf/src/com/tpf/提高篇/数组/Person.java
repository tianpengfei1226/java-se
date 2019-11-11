package com.tpf.提高篇.数组;

/**
 * <p> </p>
 *
 * @version :  Person.java,v 1.0, 2018/9/21-15:46 tianpengfei Exp $
 * @auther : tianpengfei
 */
public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
