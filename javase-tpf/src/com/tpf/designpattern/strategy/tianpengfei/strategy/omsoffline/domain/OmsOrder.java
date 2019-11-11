package com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.domain;

import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.factory.MatchOrderFactory;
import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.strategy.MatchStrategy;

import java.math.BigDecimal;

/**
 * <p> 匹配订单 </p>
 *
 * @author : tianpengfei
 * @version :  OmsOrder.java,v 1.0, 2019/1/28-17:05 tianpengfei Exp $
 */
public class OmsOrder {

	/**
	 * 匹配要素
	 */
	private MatchProp matchProp;

	/**
	 * 金额
	 */
	private BigDecimal amount;

	/**
	 * 专户号
	 */
	private String acctNo;




	public MatchProp getMatchProp() {
		return matchProp;
	}

	public void setMatchProp(MatchProp matchProp) {
		this.matchProp = matchProp;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	public MatchResult pay(OmsOrder order) {
		MatchStrategy strategy = MatchOrderFactory.getInstance().createStrategy(order);
		if (strategy != null) {
			return strategy.matchOrder(order);
		}
		return null;
	}
}
