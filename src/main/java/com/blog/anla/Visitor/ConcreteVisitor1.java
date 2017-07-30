package com.blog.anla.Visitor;
/**
 * 具体访问者1，或者可以理解成为某一种状态的改变
 * 即element状态的改变。
 * @author U-ANLA
 *
 */
public class ConcreteVisitor1 extends Visitor{

	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println("concreteElemtnA 被 ConcreteVisitor1访问");
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println("concreteElemtnB 被 ConcreteVisitor1访问");
	}
	
}	
