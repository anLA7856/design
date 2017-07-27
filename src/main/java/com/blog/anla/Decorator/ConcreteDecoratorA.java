package com.blog.anla.Decorator;

/**
 * 具体的装饰类A。
 * @author U-ANLA
 *
 */
public class ConcreteDecoratorA extends Decorator{
	private String addedState;  //增加本类独有的功能
	
	@Override
	public void operation(){
		super.operation();
		addedState = "ConcreteDecoratorA";
		System.out.println("具体装饰对象A的操作");
	}
}
