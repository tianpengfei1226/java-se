package com.tpf.designpattern.strategy.左潇龙.strategy01;

public interface CalPrice {
    // 根据原价返回一个最终的价格
    Double calPrice(Double originalPrice);
}