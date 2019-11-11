package com.tpf.rpc;

/**
 * (2) 实现服务
 */
public class HelloServiceImpl implements HelloService {

	@Override
    public String hello(String name) {
        return "Hello " + name;
    }

}