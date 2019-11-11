package com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.strategy.impl;

import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.annotation.ValidRegion;
import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.domain.MatchResult;
import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.domain.OmsOrder;
import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.strategy.MatchStrategy;

/**
 * <p> 账户号匹配 </p>
 *
 * @author : tianpengfei
 * @version :  AcctNoMatchStrategy.java,v 1.0, 2019/1/28-17:34 tianpengfei Exp $
 */
@ValidRegion(name = "ACCT_NO")
public class AcctNoMatchStrategy implements MatchStrategy {
	@Override
	public MatchResult matchOrder(OmsOrder order) {
		MatchResult result = new MatchResult();
		result.setResultCode("000");
		System.out.println("账户号，匹配。");
		return result;
	}
}
