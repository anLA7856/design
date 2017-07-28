package com.blog.anla.FactoryMethod;
/**
 * 运算的统一父类，包含相应规范的抽象类
 * @author U-ANLA
 *
 */
public abstract class Operation {
	protected double numberA;
	protected double numberB;
	public abstract double getResult(); 
}
