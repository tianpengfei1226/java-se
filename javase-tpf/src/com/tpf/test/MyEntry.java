package com.tpf.test;

/**
 * <p> </p>
 *
 * @version :  MyEntry.java,v 1.0, 2018/6/8-18:02 tianpengfei Exp $
 * @auther : tianpengfei
 */
public class MyEntry<K, V> {
    private K key;
    private V value;
    private MyEntry<K, V> next;
    private int h;

    public MyEntry() {
    }

    public MyEntry(K key, V value, MyEntry<K, V> next, int h) {
        this.key = key;
        this.value = value;
        this.next = next;
        this.h = h;
    }

    public final K getKey() {
        return key;
    }

    public final V getValue() {
        return value;
    }
}
