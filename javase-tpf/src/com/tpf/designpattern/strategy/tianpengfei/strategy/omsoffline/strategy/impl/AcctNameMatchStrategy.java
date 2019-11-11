package com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.strategy.impl;

import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.annotation.ValidRegion;
import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.domain.MatchResult;
import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.domain.OmsOrder;
import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.strategy.MatchStrategy;

/**
 * <p> 账户名称匹配 </p>
 *
 * @author : tianpengfei
 * @version :  AcctNameMatchStrategy.java,v 1.0, 2019/1/29-9:34 tianpengfei Exp $
 */
@ValidRegion(name = "ACCT_NAME")
public class AcctNameMatchStrategy implements MatchStrategy {
	@Override
	public MatchResult matchOrder(OmsOrder order) {
		MatchResult result = new MatchResult();
		System.out.println("账户名称，匹配。");
		return result;
	}
}
