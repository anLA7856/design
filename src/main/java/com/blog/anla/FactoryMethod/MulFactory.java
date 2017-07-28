package com.blog.anla.FactoryMethod;
/**
 * 创建乘法工厂
 * @author U-ANLA
 *
 */
public class MulFactory extends Factory{
	@Override
	public Operation createOperation() {
		return new OperationMul();
	}
}
