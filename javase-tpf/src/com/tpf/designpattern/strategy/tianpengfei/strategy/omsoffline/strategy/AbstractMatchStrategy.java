package com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.strategy;

import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.domain.OmsOrder;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  AbstractMatchStrategy.java,v 1.0, 2019/1/29-9:52 tianpengfei Exp $
 */
public abstract class AbstractMatchStrategy<T extends OmsOrder> implements MatchStrategy {

	public final void execute(T t){


	}

	protected abstract void validate(T t);
}
