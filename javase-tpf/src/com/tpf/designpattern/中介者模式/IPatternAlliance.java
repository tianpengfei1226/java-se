package com.tpf.designpattern.中介者模式;

/**
 * <p> </p >
 * 中介者
 *
 * @author : tianpf
 * @version :  IPatternAlliance.java,v 1.0, 2020/9/16-20:34 tianpengfei Exp $
 */
public interface IPatternAlliance {

    //加入联盟
    public abstract void add(School school);

    //联盟攻击
    public abstract void resolveAttack(School activeSide, School passiveSide);

    //联盟防御
    public abstract void resolveDefense(School passiveSide);


}
