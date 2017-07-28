package com.blog.anla.FactoryMethod;
/**
 * 创建加法工厂
 * @author U-ANLA
 *
 */
public class AddFactory extends Factory{
	@Override
	public Operation createOperation() {
		return new OperationAdd();
	}
}
