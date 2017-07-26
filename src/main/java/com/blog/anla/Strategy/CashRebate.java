package com.blog.anla.Strategy;
/**
 * 策略之二
 * 打折的策略算法
 * @author U-ANLA
 *
 */
public class CashRebate extends CashSuper{

	private float level;
	public CashRebate(int level){
		this.level = level;
	}
	
	@Override
	public int acceptCash(int money) {
		return (int)(money*level);
	}

}
