package com.tpf.designpattern.strategy.左潇龙.strategy01;

/**
 * 客户类
 */
public class Customer {

	/**
	 * 客户在本商店消费的总额
	 */
	private Double totalAmount = 0D;

	/**
	 * 客户单次消费金额
	 */
	private Double amount = 0D;

	/**
	 * 每个客户都有一个计算价格的策略，初始都是普通计算，即原价
	 */
	private CalPrice calPrice = new Common();

	/**
	 * 客户购买商品，就会增加它的总额
	 *
	 * @param amount
	 */
	public void buy(Double amount) {
		this.amount = amount;
		totalAmount += amount;
		//3000则改为金牌会员计算方式
		if (totalAmount > 3000) {
			calPrice = new GoldVip();
		}//类似
		else if (totalAmount > 2000) {
			calPrice = new SuperVip();
		} //类似
		else if (totalAmount > 1000) {
			calPrice = new Vip();
		}
	}

	/**
	 * 计算客户最终要付的钱
	 *
	 * @return
	 */
	public Double calLastAmount() {
		return calPrice.calPrice(amount);
	}
}