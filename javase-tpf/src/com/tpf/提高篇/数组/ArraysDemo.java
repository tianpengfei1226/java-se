package com.tpf.提高篇.数组;

import org.junit.Test;

import java.util.*;

/**
 * <p> </p >
 *
 * @author : tianpf
 * @version :  ArraysDemo.java,v 1.0, 2020/9/21-20:33 tianpengfei Exp $
 */
public class ArraysDemo {

    @Test
    public void testSort(){
        List<SortDTO> list = new ArrayList<>();
        list.add(new SortDTO("300"));
        list.add(new SortDTO("50"));
        list.add(new SortDTO("200"));
        list.add(new SortDTO("220"));

        // 我们先把数组的大小初始化成 list 的大小，保证能够正确执行 toArray
        SortDTO[] array = new SortDTO[list.size()];
        list.toArray(array);

        System.out.println("排序之前：{}"+ array);
        Arrays.sort(array, Comparator.comparing(SortDTO::getSortTarget));
        System.out.println("排序之后：{}"+array);

        int size = 15;
        System.out.println(size >> 1);

        LinkedList linkedList = new LinkedList();
        linkedList.add(1, 1111);


    }

}

// 自定义类
class SortDTO {
    private String sortTarget;

    public SortDTO(String sortTarget) {
        this.sortTarget = sortTarget;
    }

    public String getSortTarget() {
        return sortTarget;
    }

    public void setSortTarget(String sortTarget) {
        this.sortTarget = sortTarget;
    }
}