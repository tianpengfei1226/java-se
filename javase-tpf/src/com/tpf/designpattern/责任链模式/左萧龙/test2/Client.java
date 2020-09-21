package com.tpf.designpattern.责任链模式.左萧龙.test2;

import java.util.HashMap;
import java.util.Map;

/**
 * <p> </p >
 *
 * @author : tianpf
 * @version :  Client.java,v 1.0, 2020/9/11-10:36 tianpengfei Exp $
 */
public class Client {
    public static void main(String[] args) {
        //假设初始菜单都是以下这些东西
        Map<String, Integer> menu = new HashMap<String, Integer>();
        menu.put("汉堡", 5);
        menu.put("薯条", 5);
        menu.put("可乐", 5);
        menu.put("雪碧", 5);
        //假设有5个分店
        Subbranch mcSubbranch1 = new McSubbranch(0, 0, new HashMap<String, Integer>(menu));
        Subbranch mcSubbranch2 = new McSubbranch(100, 120, new HashMap<String, Integer>(menu));
        Subbranch mcSubbranch3 = new McSubbranch(-100, -120, new HashMap<String, Integer>(menu));
        Subbranch mcSubbranch4 = new McSubbranch(1000, 20, new HashMap<String, Integer>(menu));
        Subbranch mcSubbranch5 = new McSubbranch(-500, 0, new HashMap<String, Integer>(menu));

        //以下设置职责链
        mcSubbranch4.setSuccessor(mcSubbranch5);
        mcSubbranch3.setSuccessor(mcSubbranch4);
        mcSubbranch2.setSuccessor(mcSubbranch3);
        mcSubbranch1.setSuccessor(mcSubbranch2);
        //小左开始订餐，假设小左的坐标是900,20
        Map<String, Integer> order = new HashMap<String, Integer>();
        order.put("汉堡", 2);
        order.put("可乐", 1);
        order.put("薯条", 1);

        print(mcSubbranch1);
        System.out.println("------------------------------------------");

        //小左开始订餐，直接找mcSubbranch1的这一家分店订餐即可
        mcSubbranch1.handleOrder(new Order(900, 20, order));

        System.out.println("------------------------------------------");
        print(mcSubbranch1);
    }

    public static void print(Subbranch subbranch){
        if (subbranch == null ) {
            return;
        }
        do {
            if (subbranch instanceof McSubbranch) {
                System.out.println("[" + subbranch + "]的菜单:" + ((McSubbranch) subbranch).getMenu());
            }
        } while ((subbranch = ((McSubbranch) subbranch).getNextSubbranch()) != null);
    }
}
