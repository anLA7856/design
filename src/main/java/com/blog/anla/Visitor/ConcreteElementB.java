package com.blog.anla.Visitor;
/**
 * 具体元素2，作为element子元素，建议不要轻易添加或者删除。
 * @author U-ANLA
 *
 */
public class ConcreteElementB extends Element{

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementB(this);
	}
	
	public void otherMethodB(){}
}
