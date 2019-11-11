package com.tpf.designpattern.观察者模式.事件驱动.田鹏飞.mns.domain;

import java.util.Map;

/**
 * <p> 邮件载体 </p>
 *
 * @author : tianpengfei
 * @version :  EmailContext.java,v 1.0, 2019/1/28-14:44 tianpengfei Exp $
 */
public class EmailContext {

	/**
	 * 标题
	 */
	private String title;

	/**
	 * 内容
	 */
	private String context;

	/**
	 * 扩展信息
	 */
	private Map<String, Object> ext;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public Map<String, Object> getExt() {
		return ext;
	}

	public void setExt(Map<String, Object> ext) {
		this.ext = ext;
	}
}
