package com.tpf.javase.map;

/**
 * <p> </p>
 *HashMap的要素之一，就是数组，自然在这里，我们要定义数组，数组的初始化大小，还要考虑扩容的阀值。
 * @version :  MyHashMap.java,v 1.0, 2018/6/8-15:38 tianpengfei Exp $
 * @auther : tianpengfei
 */
public class MyHashMap<K, V> implements MyMap<K, V> {
    // 定义数据的默认初始化长度
    private static final int DEFAULT_INITIAL_CAPACITY = 1 << 4;
    // 阀值比例
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;

    private int defaultInitSize;
    private float defaultLoadFactor;

    // Map中Entry的数量
    private int entrySize;

    // 数组
    private Entry<K, V>[] tables = null;

    @Override
    public V put(K k, V v) {
        V oldValue = null;
        // 是否需要扩容
        // 扩容完毕肯定需要散列
        if (entrySize >= defaultInitSize * defaultLoadFactor) {

        }
        return null;
    }

//    void resize(int newCapacity) {
//        MyHashMap.Entry[] oldTable = tables;
//        int oldCapacity = oldTable.length;
//        if (oldCapacity == MAXIMUM_CAPACITY) {
//            threshold = Integer.MAX_VALUE;
//            return;
//        }
//
//        HashMap.Entry[] newTable = new HashMap.Entry[newCapacity];
//        transfer(newTable);
//        table = newTable;
//        threshold = (int)(newCapacity * loadFactor);
//    }

    @Override
    public V get(K k) {
        return null;
    }


    // 构造方法有什么好说的呢？
    //仔细观察下，你会发现，其实这里使用到了“门面模式”。这里的2个构造方法其实指向的是同一个，但是对外却暴露了2个“门面”！
    public MyHashMap() {
        this(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR);
    }
    public MyHashMap(int defaultInitCapacity, float defaultLoadFactor) {
        if (defaultInitCapacity < 0)
            throw new IllegalArgumentException("Illegal initial capacity: " + defaultInitCapacity);

        if (defaultLoadFactor <= 0 || Float.isNaN(defaultLoadFactor))
            throw new IllegalArgumentException("Illegal load factor: " + defaultLoadFactor);

        this.defaultInitSize = defaultInitCapacity;
        this.defaultLoadFactor = defaultLoadFactor;

        tables = new Entry[this.defaultInitSize];
    }

    // HashMap的要素之一，单链表的体现就在这里！
    class Entry<K, V> implements MyMap.Entry<K, V> {
        private K key;
        private V value;
        private Entry<K, V> next;

        public Entry() {
        }

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }
    }
}
