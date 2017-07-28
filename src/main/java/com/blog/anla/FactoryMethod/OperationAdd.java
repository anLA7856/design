package com.blog.anla.FactoryMethod;

/**
 * 加法运算类
 * @author U-ANLA
 *
 */
public class OperationAdd extends Operation{
	@Override
	public double getResult() {
		return numberA + numberB;
	}
}
