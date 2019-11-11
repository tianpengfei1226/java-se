package com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.omsenum;

/**
 * <p> 匹配方式 </p>
 *
 * @author : tianpengfei
 * @version :  MatchModeEnum.java,v 1.0, 2019/1/28-17:09 tianpengfei Exp $
 */
public enum MatchModeEnum {
	ACCURATE_MATCH("ACCURATE_MATCH", "精确匹配"),
	REGEX_MATCH("REGEX_MATCH", "模糊匹配");
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

	MatchModeEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public MatchModeEnum getByCode(String code) {
		if (code == null) {
			return null;
		}
		for (MatchModeEnum m : MatchModeEnum.values()) {
			if (code.equals(m.getCode())) {
				return m;
			}
		}
		return null;
	}
}
