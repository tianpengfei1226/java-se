package com.tpf.thread;

import java.sql.Connection;
import java.util.concurrent.*;

/**
 * <p> </p>
 *
 * @version :  FutureTest.java,v 1.0, 2018/6/13-11:24 tianpengfei Exp $
 * @auther : tianpengfei
 */
public class FutureTest {
    public static void main(String[] args) throws Exception {
        FutureTask<Object> futureTask = new FutureTask<Object>(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                System.out.println("sssssssss");
                return "aaaa";
            }
        });

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(futureTask);

        System.out.println(">>> " + futureTask.get());

        executor.shutdown();



    }


}
