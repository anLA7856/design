package com.blog.anla.Visitor;

public class ConcreteVisitor2 extends Visitor{

	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println("concreteElemtnA 被 ConcreteVisitor2访问");
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println("concreteElemtnB 被 ConcreteVisitor2访问");
	}
	
}	
