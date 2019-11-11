package com.tpf.designpattern.观察者模式.事件驱动.左潇龙;

import java.util.HashMap;
import java.util.Map;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  WriterManager.java,v 1.0, 2018/11/26-16:21 tianpengfei Exp $
 */
public class WriterManager {
	private Map<String, Writer> writerMap = new HashMap<String, Writer>();

	/**
	 * 添加作者
	 *
	 * @param writer
	 */
	public void add(Writer writer) {
		writerMap.put(writer.getName(), writer);
	}

	/**
	 * 根据作者姓名获取作者
	 *
	 * @param name
	 * @return
	 */
	public Writer getWriter(String name) {
		return writerMap.get(name);
	}

	/**
	 * 单例
	 */
	private WriterManager() {

	}

	public static WriterManager getInstance() {
		return WriterManagerHolder.instance;
	}

	/**
	 * 静态内部类
	 */
	private static class WriterManagerHolder {
		private static WriterManager instance = new WriterManager();
	}
}
