package com.tpf.提高篇.对象拷贝;

/**
 * <p> </p>
 *
 * @version :  Person.java,v 1.0, 2018/9/17-18:06 tianpengfei Exp $
 * @auther : tianpengfei
 */
public class Person implements Cloneable {
    /** 姓名 **/
    private String name;

    /** 电子邮件 **/
    private Email email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    @Override
    protected Person  clone() {
        Person person = null;
        try {
            person = (Person) super.clone();
            person.setEmail(new Email(person.getEmail().getTitle(), person.getEmail().getContent()));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return person;
    }

    public Person(String name, Email email) {
        this.name = name;
        this.email = email;
    }

    public Person() {
    }
}
