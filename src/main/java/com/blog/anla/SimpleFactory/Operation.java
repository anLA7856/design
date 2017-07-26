package com.blog.anla.SimpleFactory;

public abstract class Operation {
	protected double numberA;
	protected double numberB;
	/**
	 * 得到运算结果
	 * @return
	 */
	public abstract double getResult();
}
