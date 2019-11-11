package com.tpf.提高篇.对象拷贝;

/**
 * <p> </p>
 *
 * @version :  Email.java,v 1.0, 2018/9/17-18:12 tianpengfei Exp $
 * @auther : tianpengfei
 */
public class Email {
    private String title;
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Email(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Email() {
    }
}
