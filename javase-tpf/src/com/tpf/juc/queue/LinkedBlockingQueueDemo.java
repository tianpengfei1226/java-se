package com.tpf.juc.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * <p> </p >
 *
 * @author : tianpf
 * @version :  LinkedBlockingQueueDemo.java,v 1.0, 2020/9/14-20:13 tianpengfei Exp $
 */
public class LinkedBlockingQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue queue = new LinkedBlockingQueue();

        queue.put("tpf1");

        queue.offer("tpf2");
        queue.offer("tpf3");

        queue.take();

        List<String> list = new ArrayList<>();
        list.add(null);

        LinkedBlockingQueue queue1 = new LinkedBlockingQueue(list);




    }
}
