package com.tpf.jiagou;

/**
 * <p> </p>
 *
 * @version :  TestMain.java,v 1.0, 2018/6/12-10:49 tianpengfei Exp $
 * @auther : tianpengfei
 */
public class TestMain {
    public static void main(String[] args) {
        new SyncPaymentTemplate() {
            @Override
            int sendRequest(int p) {
                System.out.println("sendRequest....");
                return 0;
            }
        }.execute();
    }
}
