package com.blog.anla.FactoryMethod;
/**
 * 工厂类，用于定义统一的规范的抽象类
 * 即专门用于创建工厂
 * @author U-ANLA
 *
 */
public abstract class Factory {
	public abstract Operation createOperation();
}
