package com.tpf.designpattern.观察者模式.事件驱动.田鹏飞.mns.listener;

import com.tpf.designpattern.观察者模式.事件驱动.田鹏飞.mns.event.EmailEvent;

import java.util.EventListener;

/**
 * <p> 邮件监听器 </p>
 *
 * @author : tianpengfei
 * @version :  EmailListener.java,v 1.0, 2019/1/28-14:51 tianpengfei Exp $
 */
public interface EmailListener<T extends EmailEvent> extends EventListener {

	void sendEmail(T emailEvent);

}
