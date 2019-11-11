package com.tpf.javase.map;

/**
 * <p> </p>
 *
 * @version :  MyMap.java,v 1.0, 2018/6/8-15:35 tianpengfei Exp $
 * @auther : tianpengfei
 */
public interface MyMap<K, V> {
    public V put(K k, V v);
    public V get(K k);

    interface Entry<K, V>{
        public K getKey();
        public V getValue();
    }
}
