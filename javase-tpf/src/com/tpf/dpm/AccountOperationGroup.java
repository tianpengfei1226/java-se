package com.tpf.dpm;


import java.util.ArrayList;
import java.util.List;

/**
 * <p>帐户操作信息分组</p>
 * @author funder.fu
 * @version $Id: AccountDetailGroup.java, v 0.1 2012-9-26 下午12:11:41 fuyangbiao Exp $
 */
public class AccountOperationGroup implements Comparable<AccountOperationGroup> {
    /** 帐号 */
    private String              accountNo;
    /** 账户余额明细 */
    private List<AccountDetail> details = new ArrayList<AccountDetail>();

    /** 默认构造 */
    public AccountOperationGroup() {

    }

    /**
     * 根据明细构造
     */
    public AccountOperationGroup(AccountDetail accountDetail) {
        this.accountNo = accountDetail.getAccountNo();
        this.addAccountDetail(accountDetail);
    }

    /**
     * 增加帐户明细
     * @param accountDetail
     */
    public void addAccountDetail(AccountDetail accountDetail) {
        this.details.add(accountDetail);
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public List<AccountDetail> getDetails() {
        return details;
    }

    public void setDetails(List<AccountDetail> details) {
        this.details = details;
    }

    @Override
    public int compareTo(AccountOperationGroup accountOperationGroup) {
        if (accountNo.length() == accountOperationGroup.getAccountNo().length()) {
            return this.accountNo.compareTo(accountOperationGroup.getAccountNo());
        } else if (accountNo.length() > accountOperationGroup.getAccountNo().length()) {
            return 1;
        } else {
            return -1;
        }
    }
}
