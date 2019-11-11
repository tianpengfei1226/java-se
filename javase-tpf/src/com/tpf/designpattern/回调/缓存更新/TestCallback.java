package com.tpf.designpattern.回调.缓存更新;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  TestCallback.java,v 1.0, 2019/8/1-10:05 tianpengfei Exp $
 */
public class TestCallback {

	private void updateDB() {
		System.out.println("update DB");
	}

	private void updateCache() {
		System.out.println("update Cache");
	}

	public void update(CacheCallback callBack ) {
		updateDB();

		if(callBack != null) {
			callBack.callback();
		}

		updateCache();
	}

	public static void main( String[] args ) {
		TestCallback testCallback = new TestCallback();

		testCallback.update(new CacheCallback() {
			@Override
			public void callback() {
				new AnotherClass().updateXXX();
			}
		});

		System.out.println("-------------------------------------------");

		testCallback.update(null);
	}

}
