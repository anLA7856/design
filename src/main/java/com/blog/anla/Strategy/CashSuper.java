package com.blog.anla.Strategy;
/**
 * 策略模式，策略的公共父类
 * 策略模式和简单工厂模式不同，前者注重不同的算法
 * 而后者助攻的产生哪一个对象
 * @author U-ANLA
 *
 */
public abstract class CashSuper {
	/**
	 * 抽象的策略方法
	 */
	public abstract int acceptCash(int money);
}
