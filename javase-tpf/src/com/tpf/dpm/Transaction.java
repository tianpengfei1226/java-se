package com.tpf.dpm;

import java.util.ArrayList;
import java.util.List;

/**
 * <p> </p >
 *
 * @author : tianpf
 * @version :  Transaction.java,v 1.0, 2020/8/8-17:10 Exp $
 */
public class Transaction {

    /** 事务ID**/
    private String               transactionId;

    /** 入账明细**/
    private List<AccountDetail> details = new ArrayList<AccountDetail>();

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }


    public List<AccountDetail> getDetails() {
        return details;
    }

    public void setDetails(List<AccountDetail> details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
