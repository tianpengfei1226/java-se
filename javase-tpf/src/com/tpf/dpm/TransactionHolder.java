package com.tpf.dpm;

/**
 * <p> </p >
 *
 * @author : tianpf
 * @version :  TransactionHolder.java,v 1.0, 2020/8/8-17:09 Exp $
 */
public class TransactionHolder {

    /** 本地线程 */
    private static ThreadLocal<Transaction> requestLocal = new ThreadLocal<Transaction>();

    /**
     * 默认构造函数
     */
    public TransactionHolder() {
    }

    /**
     * 取得transaction信息。
     *
     * @return
     */
    public static Transaction get() {
        if (requestLocal.get() == null) {
            requestLocal.set(new Transaction());
        }

        return requestLocal.get();
    }

    /**
     * 设置transaction
     * @param
     */
    public static void set(Transaction transaction) {
        requestLocal.set(transaction);
    }

    /**
     * 清理transaction和DrCrPayer上下文
     */
    public static void clear() {
        requestLocal.remove();
    }

}
