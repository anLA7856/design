package com.blog.anla.Strategy;

/**
 * 策略之三
 * 职责是满减活动
 * @author U-ANLA
 *
 */
public class CashReturn extends CashSuper{
	private int threshold;
	private int reduction;
	
	public CashReturn(int threshold,int reduction){
		this.threshold = threshold;
		this.reduction = reduction;
	}
	
	@Override
	public int acceptCash(int money) {
		if(money < threshold){
			return money;
		}else{
			return money - reduction;
		}
	}
}
