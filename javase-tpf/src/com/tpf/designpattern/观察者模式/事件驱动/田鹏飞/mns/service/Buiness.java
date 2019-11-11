package com.tpf.designpattern.观察者模式.事件驱动.田鹏飞.mns.service;

import com.tpf.designpattern.观察者模式.事件驱动.田鹏飞.mns.listener.EmailListener;

/**
 * <p> 业务类 </p>
 *
 * @author : tianpengfei
 * @version :  Buiness.java,v 1.0, 2019/1/28-15:00 tianpengfei Exp $
 */
public class Buiness {
	private EmailListener emailListener;

	public EmailListener getEmailListener() {
		return emailListener;
	}

	public void setEmailListener(EmailListener emailListener) {
		this.emailListener = emailListener;
	}


}
