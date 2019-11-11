package com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.omsenum;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  MatchType.java,v 1.0, 2019/1/29-17:14 tianpengfei Exp $
 */
public enum MatchType {

	NOTE("NOTE","附言码"),
	AMOUNT("AMOUNT","金额"),
	ACCT_NO("ACCT_NO","账户号"),
	ACCT_NAME("ACCT_NAME","账户名称");

	private String code;
	private String msg;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	MatchType(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}
}
