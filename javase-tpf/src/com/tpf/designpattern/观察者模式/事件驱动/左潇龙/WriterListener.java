package com.tpf.designpattern.观察者模式.事件驱动.左潇龙;

import java.util.EventListener;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  WriterListener.java,v 1.0, 2018/11/26-16:19 tianpengfei Exp $
 */
public interface WriterListener extends EventListener {

	/**
	 * 发布小说
	 *
	 * @param writerEvent
	 */
	void addNovel(WriterEvent writerEvent);

}
