package com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.omsenum;

/**
 * <p>  </p>
 *
 * @author : tianpengfei
 * @version :  MatchModeEnum.java,v 1.0, 2019/1/28-17:09 tianpengfei Exp $
 */
public enum YesOrNo {
	Y("Y", "是"),
	N("N", "否");
	private String code;
	private String message;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	YesOrNo(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public YesOrNo getByCode(String code) {
		if (code == null) {
			return null;
		}
		for (YesOrNo m : YesOrNo.values()) {
			if (code.equals(m.getCode())) {
				return m;
			}
		}
		return null;
	}
}
