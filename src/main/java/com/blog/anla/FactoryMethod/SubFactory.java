package com.blog.anla.FactoryMethod;
/**
 * 创建减法工厂
 * @author U-ANLA
 *
 */
public class SubFactory extends Factory{
	@Override
	public Operation createOperation() {
		return new OperationSub();
	}
}
