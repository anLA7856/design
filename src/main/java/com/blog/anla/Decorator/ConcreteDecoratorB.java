package com.blog.anla.Decorator;
/**
 * 具体装饰对象B
 * @author U-ANLA
 *
 */
public class ConcreteDecoratorB extends Decorator{
	
	@Override
	public void operation() {
		super.operation();
		anotherBehavior();
		System.out.println("具体装饰对象B的操作");
	}
	
	private void anotherBehavior(){
		System.out.println("I am another behavior!");
	}
}
