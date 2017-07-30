package com.blog.anla.Visitor;
/**
 * 具体元素1，作为element子元素，建议不要轻易添加或者删除。
 * 实现处理元素与数据分离
 * @author U-ANLA
 *
 */
public class ConcreteElementA extends Element{

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}
	
	public void otherMethodA(){}
}
