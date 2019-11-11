package com.tpf.重构.左潇龙.methodpara;


/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  BadExample.java,v 1.0, 2018/11/16-17:30 tianpengfei Exp $
 */
class BadExample {
	public void someMethod(int i, int j, int k, int m) {

	}
}

//----------------------------------

class GoodExample {
	void someMethod(Data data) {
		data.getI();
	}
}

class Data {
	int i;
	int j;
	int k;
	int m;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}
}