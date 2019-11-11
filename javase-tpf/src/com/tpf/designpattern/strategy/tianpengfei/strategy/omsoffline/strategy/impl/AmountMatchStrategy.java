package com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.strategy.impl;

import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.annotation.ValidRegion;
import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.domain.MatchResult;
import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.domain.OmsOrder;
import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.strategy.MatchStrategy;

/**
 * <p> 金额匹配 </p>
 *
 * @author : tianpengfei
 * @version :  AmountMatchStrategy.java,v 1.0, 2019/1/29-9:35 tianpengfei Exp $
 */

@ValidRegion(name = "AMOUNT")
public class AmountMatchStrategy implements MatchStrategy {
	@Override
	public MatchResult matchOrder(OmsOrder order) {
		MatchResult result = new MatchResult();
		System.out.println("金额匹配.");
		return result;
	}
}
