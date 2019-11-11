package com.tpf.提高篇.数组;

import java.util.Arrays;

/**
 * <p> </p>
 *
 * @version :  ArrayUtils.java,v 1.0, 2018/9/21-15:29 tianpengfei Exp $
 * @auther : tianpengfei
 */
public class ArrayUtils {

    /**
     * 对数据进行扩容
     * @param datas 原始数组
     * @param newLen 扩容大小
     * @param <T>
     * @return
     */
    public static <T> T[] expandCapacity(T[] datas,int newLen) {
        newLen = newLen < 0 ? datas.length : datas.length + newLen;
        //生成一个新的数组
        return Arrays.copyOf(datas, newLen);
    }

    /**
     * 对数据扩容1.5倍
     * @param datas 原始数组
     * @param <T>
     * @return
     */
    public static <T> T[] expandCapacity(T[] datas) {
        int newLen = (datas.length * 3) / 2;
        return Arrays.copyOf(datas, newLen);
    }

    /**
     * 对数组指定倍数进行扩容
     * @param datas 原始数组
     * @param mulitiple 扩容倍数
     * @param <T>
     * @return
     */
    public static <T> T[] expandCapacityMul(T[] datas, int mulitiple) {
        mulitiple = mulitiple < 0 ? 1 : mulitiple;
        int newLen = datas.length * mulitiple;
        return Arrays.copyOf(datas, newLen);
    }
}
