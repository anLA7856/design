package com.blog.anla.Visitor;

/**
 * 为该对象结构中每一个ConcreteElemetn都声明一个
 * visit操作，如下面的visitA和visitB
 * 如果element元素更改的话，就会直接导致这里面要改，
 * 以及visitor的子类也要改，所以适合element元素基本不该动
 * 的系统中使用
 * @author U-ANLA
 *
 */
public abstract class Visitor {
	public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);
	public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
}
