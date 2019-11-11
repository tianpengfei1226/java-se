package com.tpf.designpattern.观察者模式.事件驱动.左潇龙;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  Reader.java,v 1.0, 2018/11/26-16:20 tianpengfei Exp $
 */
public class Reader implements WriterListener {

	private String name;

	public Reader(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	/**
	 * 读者可以关注某一位作者，关注则代表把自己加到作者的监听器列表里
	 *
	 * @param writerName
	 */
	public void subscribe(String writerName) {
		WriterManager.getInstance().getWriter(writerName).registerListener(this);
	}

	/**
	 * 读者可以取消关注某一位作者，取消关注则代表把自己从作者的监听器列表里注销
	 *
	 * @param writerName
	 */
	public void unsubscribe(String writerName) {
		WriterManager.getInstance().getWriter(writerName).unregisterListener(this);
	}

	@Override
	public void addNovel(WriterEvent writerEvent) {
		Writer writer = writerEvent.getWriter();
		System.out.println(name + "知道" + writer.getName() + "发布了新书《" + writer.getLastNovel() + "》，非要去看！");
	}
}
