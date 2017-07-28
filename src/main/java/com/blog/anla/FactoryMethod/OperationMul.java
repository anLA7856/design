package com.blog.anla.FactoryMethod;
/**
 * 乘法运算
 * @author U-ANLA
 *
 */
public class OperationMul extends Operation{
	@Override
	public double getResult() {
		return numberA * numberB;
	}
}
