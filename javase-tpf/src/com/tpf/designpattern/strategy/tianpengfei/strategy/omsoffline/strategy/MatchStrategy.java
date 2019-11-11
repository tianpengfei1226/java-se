package com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.strategy;

import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.domain.MatchResult;
import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.domain.OmsOrder;

/**
 * <p> OMS 订单匹配策略接口 </p>
 *
 * @author : tianpengfei
 * @version :  MatchStrategy.java,v 1.0, 2019/1/28-17:04 tianpengfei Exp $
 */
public interface MatchStrategy {

	/**
	 * 匹配订单
	 *
	 * @param order 待匹配的订单
	 * @return 匹配结果
	 */
	MatchResult matchOrder(OmsOrder order);
}
