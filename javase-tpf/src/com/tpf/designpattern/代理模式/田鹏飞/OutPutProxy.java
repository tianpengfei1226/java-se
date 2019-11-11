package com.tpf.designpattern.代理模式.田鹏飞;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  OutPutProxy.java,v 1.0, 2018/10/18-10:07 tianpengfei Exp $
 */
public class OutPutProxy {

	public static void main(String[] args) throws Exception {
		byte[] data = ProxyGenerator.generateProxyClass(
				"$Proxy0", new Class[]{IPerson.class});
		FileOutputStream out = new FileOutputStream("E:/$Proxy0.class");
		out.write(data);
		out.close();
	}
}
