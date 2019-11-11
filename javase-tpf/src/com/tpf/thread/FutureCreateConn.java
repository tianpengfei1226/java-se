package com.tpf.thread;

import java.sql.Connection;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.FutureTask;

/**
 * <p> </p>
 *
 * @version :  FutureCreateConn.java,v 1.0, 2018/6/13-13:30 tianpengfei Exp $
 * @auther : tianpengfei
 */
public abstract class FutureCreateConn<T> {

    private ConcurrentHashMap<String, FutureTask<Connection>> connectionPool = new ConcurrentHashMap<String, FutureTask<Connection>>();

    public Connection getConnection(String key) throws Exception {
        FutureTask<Connection> connectionTask = connectionPool.get(key);
        if (connectionTask != null) {
            return connectionTask.get();
        } else {

            FutureTask<Connection> newTask = new FutureTask<Connection>(new FutureTaskCallable());
            connectionTask = connectionPool.putIfAbsent(key, newTask);
            if (connectionTask == null) {
                connectionTask = newTask;
                connectionTask.run();
            }
            return connectionTask.get();
        }
    }

    //创建Connection
    private Connection createConnection() {
        return null;
    }

    class FutureTaskCallable implements Callable<Connection> {
        private T domin;

        @Override
        public Connection call() throws Exception {
            boolean re = executeTask(domin);
            return createConnection();
        }

    }

    public abstract boolean executeTask(T domin);

    class FutureResult {

    }

}
