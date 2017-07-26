package com.blog.anla.Strategy;
/**
 * 策略之一
 * 按原价收费
 * @author U-ANLA
 *
 */
public class CashNormal extends CashSuper{
	@Override
	public int acceptCash(int money) {
		return money;
	}
}
