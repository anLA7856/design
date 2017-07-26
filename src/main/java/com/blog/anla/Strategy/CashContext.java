package com.blog.anla.Strategy;

/**
 * 维护对具体CashSuper的策略的引用
 * @author U-ANLA
 *
 */
public class CashContext {
	private CashSuper cs = null;
	public CashContext(CashSuper cs){
		this.cs = cs;
	}
	
	public int getResult(int money){
		return cs.acceptCash(money);
	}
}
