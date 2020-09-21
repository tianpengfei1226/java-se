package com.tpf.dpm;

/**
 * <p> </p >
 *
 * @author : tianpf
 * @version :  Test.java,v 1.0, 2020/8/17-15:33 Exp $
 */
public class Test {

    public static void main(String[] args) {
        String ruleOfAccountType= "crdrDefault:101,201";
        for (String s : ruleOfAccountType.split("[|]")) {
            String[] ruleStr = s.split(":");
            for (String accountType : ruleStr[1].split(",")) {
                System.out.println(accountType);
                System.out.println(ruleStr[0]);
//                accountRuleMap.put(accountType, rules.get(ruleStr[0]));
            }
        }
    }
}
