package com.tpf.dpm;

import java.util.*;

/**
 * <p> </p >
 *
 * @author : tianpf
 * @version :  MainTest.java,v 1.0, 2020/8/8-17:13 Exp $
 */
public class MainTest {

    public static void main(String[] args) {
        AccountDetail detail = new AccountDetail();
        detail.setSeqNo(123L);
        detail.setProductCode("10003");
        detail.setTransactionNo("12345");
        detail.setAccountNo("111111111");

        AccountDetail detail2 = new AccountDetail();
        detail2.setSeqNo(234L);
        detail2.setProductCode("10003");
        detail2.setTransactionNo("12345");
        detail2.setAccountNo("111111111");

        AccountDetail detail3 = new AccountDetail();
        detail3.setSeqNo(55555L);
        detail3.setProductCode("10003");
        detail3.setTransactionNo("12345");
        detail3.setAccountNo("2222222");


        Transaction transaction = new Transaction();
        transaction.getDetails().add(detail);
        transaction.getDetails().add(detail2);
        transaction.getDetails().add(detail3);

        TransactionHolder.set(transaction);


        List<AccountOperationGroup> operationGroupList = new ArrayList<AccountOperationGroup>();

//        Collections.sort(operationGroupList);
//        for (AccountOperationGroup accountOperationGroup : operationGroupList) {
//            System.out.println("1111");
//        }
//
//        System.out.println("2222");


        List<AccountDetail> bufferAccountDetailList = new ArrayList<AccountDetail>();

//        buildBufferOperationGroup(operationGroupList, TransactionHolder.get().getDetails());

        buildOperationGroup(operationGroupList, bufferAccountDetailList);
        System.out.println("准备开始更新余额，实时入账[{"+TransactionHolder.get().getDetails().size()+"}]条，缓冲入账[{"+bufferAccountDetailList.size()+"}]条");
        System.out.println("排序前：operationGroupList 》》 " + operationGroupList);
        Collections.sort(operationGroupList);
        System.out.println("排序后：operationGroupList 》》》 " + operationGroupList);
    }

    private static void buildBufferOperationGroup(List<AccountOperationGroup> operationGroupList, List<AccountDetail> bufferAccountDetailList) {
        Map<String, AccountOperationGroup> groupMap = new HashMap<String, AccountOperationGroup>();
        //分组汇总
        for (AccountDetail accountDetail : bufferAccountDetailList) {
            // 保存实时入账操作组
            group(operationGroupList, groupMap, accountDetail);
        }

    }

    private static void group(List<AccountOperationGroup> operationGroupList, Map<String, AccountOperationGroup> groupMap,
                       AccountDetail accountDetail) {
        AccountOperationGroup sameGroup = groupMap.get(accountDetail.getAccountNo());
        if (sameGroup == null) {
            AccountOperationGroup group = new AccountOperationGroup(accountDetail);

            groupMap.put(group.getAccountNo(), group);
            operationGroupList.add(group);
        } else {
            sameGroup.addAccountDetail(accountDetail);
        }
    }

    private static void buildOperationGroup(List<AccountOperationGroup> operationGroupList, List<AccountDetail> bufferAccountDetailList) {
        List<AccountDetail> accountDetails = TransactionHolder.get().getDetails();
        Map<String, AccountOperationGroup> groupMap = new HashMap<String, AccountOperationGroup>();

        //缓冲入账:分录保存到缓冲入账池;实时入账:分组汇总
        for (AccountDetail accountDetail : accountDetails) {
            if (bufferAccountDetailList.size()==0) {
                // 保存缓冲入账明细
                bufferAccountDetailList.add(accountDetail);
            } else {
                group(operationGroupList, groupMap, accountDetail);
            }
        }
        // 删除缓冲明细
        System.out.println("bufferAccountDetailList : " + bufferAccountDetailList);
        accountDetails.removeAll(bufferAccountDetailList);
        System.out.println("accountDetails : " + accountDetails);
        System.out.println(">>> " + TransactionHolder.get().getDetails());
        List<AccountDetail> details = TransactionHolder.get().getDetails();
        for (AccountDetail detail : details) {
            System.out.println("123adfadfasdf");
        }
        System.out.println("000000000");

    }

}
