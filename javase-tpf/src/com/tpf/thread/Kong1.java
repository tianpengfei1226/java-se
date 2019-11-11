package com.tpf.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * <p> </p>
 *
 * @version :  Kong1.java,v 1.0, 2018/6/11-12:27 tianpengfei Exp $
 * @auther : tianpengfei
 */
public class Kong1 {

    public static void main(String[] args) {
        final BlockingQueue<String> queue = new ArrayBlockingQueue<String>(16);//snew LinkedBlockingDeque<String>();
        for (int i = 0; i < 4; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
//                    while (true) {
                        try {
                            String log = queue.take();
                            printLog(log);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
//                    }
                }
            }).start();
        }


        for (int i =0; i<16; i++) {
            try {
                queue.put("log_" +i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    static void printLog(String log) {
        System.out.println(log);
    }
}
