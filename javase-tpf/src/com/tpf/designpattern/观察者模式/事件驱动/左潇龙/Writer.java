package com.tpf.designpattern.观察者模式.事件驱动.左潇龙;

import java.util.HashSet;
import java.util.Set;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  Writer.java,v 1.0, 2018/11/26-16:18 tianpengfei Exp $
 */
public class Writer {

	/**
	 * 作者的名称
	 */
	private String name;

	/**
	 * 记录作者最新发布的小说
	 */
	private String lastNovel;

	/**
	 * 作者类要包含一个自己监听器的列表
	 */
	private Set<WriterListener> writerListenerList = new HashSet<WriterListener>();

	public Writer(String name) {
		super();
		this.name = name;
		WriterManager.getInstance().add(this);
	}

	/**
	 * 作者发布新小说了，要通知所有关注自己的读者
	 */
	public void addNovel(String novel) {
		System.out.println(name + "发布了新书《" + novel + "》！");
		lastNovel = novel;
		fireEvent();
	}

	/**
	 * 触发发布新书的事件，通知所有监听这件事的监听器
	 */
	private void fireEvent() {
		WriterEvent writerEvent = new WriterEvent(this);
		for (WriterListener writerListener : writerListenerList) {
			writerListener.addNovel(writerEvent);
		}
	}

	/**
	 * 提供给外部注册成为自己的监听器的方法
	 *
	 * @param writerListener
	 */
	public void registerListener(WriterListener writerListener) {
		writerListenerList.add(writerListener);
	}

	/**
	 * 提供给外部注销的方法
	 *
	 * @param writerListener
	 */
	public void unregisterListener(WriterListener writerListener) {
		writerListenerList.remove(writerListener);
	}

	public String getLastNovel() {
		return lastNovel;
	}

	public String getName() {
		return name;
	}
}
