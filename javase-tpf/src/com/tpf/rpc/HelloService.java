package com.tpf.rpc;

/**
 * (1) 定义服务接口
 */
public interface HelloService {

	/**
	 * 服务
	 * @param name
	 * @return
	 */
    String hello(String name);

}