package com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.domain;

import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.omsenum.MatchModeEnum;
import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.omsenum.YesOrNo;

/**
 * <p> 匹配要素 </p>
 *
 * @author : tianpengfei
 * @version :  MatchProp.java,v 1.0, 2019/1/28-17:06 tianpengfei Exp $
 */
public class MatchProp {

	/**
	 * 匹配要素名称
	 */
	private String propName;

	/**
	 * 匹配方式
	 */
	private MatchModeEnum matchMode;

	/**
	 * 匹配策略
	 */
	private String matchStrategy;

	/**
	 * 优先级
	 */
	private int priority;

	/**
	 * 是否必选
	 */
	private YesOrNo yesOrNo;

	public String getPropName() {
		return propName;
	}

	public void setPropName(String propName) {
		this.propName = propName;
	}

	public MatchModeEnum getMatchMode() {
		return matchMode;
	}

	public void setMatchMode(MatchModeEnum matchMode) {
		this.matchMode = matchMode;
	}

	public String getMatchStrategy() {
		return matchStrategy;
	}

	public void setMatchStrategy(String matchStrategy) {
		this.matchStrategy = matchStrategy;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public YesOrNo getYesOrNo() {
		return yesOrNo;
	}

	public void setYesOrNo(YesOrNo yesOrNo) {
		this.yesOrNo = yesOrNo;
	}
}
