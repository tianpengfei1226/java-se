package com.tpf.jiagou;

/**
 * <p> </p>
 *
 * @version :  SyncPaymentTemplate.java,v 1.0, 2018/6/12-10:48 tianpengfei Exp $
 * @auther : tianpengfei
 */
public abstract class SyncPaymentTemplate {

    public String execute(){
        System.out.println("execute......");
        sendRequest(11);
        return "aaaa";
    }

    abstract int sendRequest(int p);
}
