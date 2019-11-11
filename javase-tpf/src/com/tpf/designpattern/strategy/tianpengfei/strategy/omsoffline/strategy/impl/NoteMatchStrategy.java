package com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.strategy.impl;

import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.annotation.ValidRegion;
import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.domain.MatchResult;
import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.domain.OmsOrder;
import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.omsenum.MatchModeEnum;
import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.strategy.AbstractMatchStrategy;
import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.strategy.MatchStrategy;

/**
 * <p> 附言码匹配 </p>
 *
 * @author : tianpengfei
 * @version :  NoteMatchStrategy.java,v 1.0, 2019/1/28-17:35 tianpengfei Exp $
 */

@ValidRegion(name = "NOTE")
public class NoteMatchStrategy extends AbstractMatchStrategy implements MatchStrategy {

	@Override
	public MatchResult matchOrder(OmsOrder order) {
		MatchResult result = new MatchResult();

		// 校验订单
		validate(order);

		// 从缓存中获取专户所属的业务账户
		// loadBusinessAcctFromCache();

		// 1、是否已经查询过了，查询过了直接获取上一个匹配策略中的待支付订单集合
		// 2、若该匹配策略为优先级最高的匹配策略，则根据 匹配要素+交易场所+业务账户 查询所有付款中的订单
		// queryDB();

		if (MatchModeEnum.ACCURATE_MATCH.equals(order.getMatchProp().getMatchMode())) {
			System.out.println("附言码匹配，精确匹配");
		} else if (MatchModeEnum.REGEX_MATCH.equals(order.getMatchProp().getMatchMode())) {
			System.out.println("附言码匹配，模糊匹配");
		}

		// 构建匹配结果

		return result;
	}

	@Override
	protected void validate(OmsOrder omsOrder) {
//		System.out.println("附言码匹配，校验订单。。。");
	}
}
