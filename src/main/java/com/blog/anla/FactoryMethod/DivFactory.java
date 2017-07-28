package com.blog.anla.FactoryMethod;
/**
 * 创建除法工厂。
 * @author U-ANLA
 *
 */
public class DivFactory extends Factory{
	@Override
	public Operation createOperation() {
		return new OperationDiv();
	}
}
