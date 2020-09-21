package com.tpf.designpattern.责任链模式.左萧龙.test2;

/**
 * <p> </p >
 *
 * @author : tianpf
 * @version :  Subbranch.java,v 1.0, 2020/9/11-10:34 tianpengfei Exp $
 */
public interface Subbranch {
    void setSuccessor(Subbranch subbranch);

    boolean handleOrder(Order order);
}
