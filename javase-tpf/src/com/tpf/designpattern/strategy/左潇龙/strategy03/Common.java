package com.tpf.designpattern.strategy.左潇龙.strategy03;

@TotalValidRegion(max=1000)//设置普通的在0-1000生效，以下类似，不再注释
class Common implements CalPrice {

    public Double calPrice(Double originalPrice) {
        return originalPrice;
    }

}
@TotalValidRegion(min=1000,max=2000)
class Vip implements CalPrice{

    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.8;
    }

}
@TotalValidRegion(min=2000,max=3000)
class SuperVip implements CalPrice{

    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.7;
    }

}
@TotalValidRegion(min=3000)
class GoldVip implements CalPrice{

    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.5;
    }

}