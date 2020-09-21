package com.tpf.java8.方法引用;

/**
 * <p> </p >
 *
 * @author : tianpf
 * @version :  User.java,v 1.0, 2020/8/27-11:01 tianpengfei Exp $
 */

public class User {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User aaa(String name) {
        return new User();
    }
}
