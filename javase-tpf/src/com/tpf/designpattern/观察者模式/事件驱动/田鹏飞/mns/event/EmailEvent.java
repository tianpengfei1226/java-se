package com.tpf.designpattern.观察者模式.事件驱动.田鹏飞.mns.event;

import com.tpf.designpattern.观察者模式.事件驱动.田鹏飞.mns.domain.EmailContext;

import java.util.EventObject;

/**
 * <p> 邮件事件源 </p>
 *
 * @author : tianpengfei
 * @version :  EmailEvent.java,v 1.0, 2019/1/28-14:48 tianpengfei Exp $
 */
public class EmailEvent extends EventObject {
	/**
	 * Constructs a prototypical Event.
	 *
	 * @param source The object on which the Event initially occurred.
	 * @throws IllegalArgumentException if source is null.
	 */
	public EmailEvent(EmailContext source) {
		super(source);
	}
}
