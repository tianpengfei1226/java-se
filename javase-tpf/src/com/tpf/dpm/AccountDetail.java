package com.tpf.dpm;

/**
 * <p> </p >
 *
 * @author : tianpf
 * @version :  AccountDetail.java,v 1.0, 2020/8/8-17:12 Exp $
 */
public class AccountDetail {
    /** 明细流水号 */
    private Long                   seqNo;
    /** 事务号（结算提交包号） */
    private String                 transactionNo;
    /** 产品编码 */
    private String                 productCode;

    private String accountNo;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public Long getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Long seqNo) {
        this.seqNo = seqNo;
    }

    public String getTransactionNo() {
        return transactionNo;
    }

    public void setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}
