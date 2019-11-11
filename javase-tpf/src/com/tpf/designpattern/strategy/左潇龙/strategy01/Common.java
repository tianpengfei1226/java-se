package com.tpf.designpattern.strategy.左潇龙.strategy01;

/**
 * 普通客户 策略
 */
class Common implements CalPrice {

    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice;
    }

}

/**
 * VIP 策略
 */
class Vip implements CalPrice {

    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.8;
    }

}

/**
 * 超级VIP 策略
 */
class SuperVip implements CalPrice {

    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.7;
    }

}

/**
 * 顶级会员 策略
 */
class GoldVip implements CalPrice {

    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.5;
    }

}