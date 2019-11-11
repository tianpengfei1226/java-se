package com.tpf.designpattern.观察者模式.事件驱动.左潇龙;

import java.util.EventObject;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  WriterEvent.java,v 1.0, 2018/11/26-16:16 tianpengfei Exp $
 */
public class WriterEvent extends EventObject {
	/**
	 * Constructs a prototypical Event.
	 *
	 * @param source The object on which the Event initially occurred.
	 * @throws IllegalArgumentException if source is null.
	 */
	public WriterEvent(Writer source) {
		super(source);
	}

	public Writer getWriter(){
		return (Writer) super.getSource();
	}

}
