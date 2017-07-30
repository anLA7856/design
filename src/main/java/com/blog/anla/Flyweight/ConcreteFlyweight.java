package com.blog.anla.Flyweight;

public class ConcreteFlyweight extends Flyweight{

	@Override
	public void operation(int extrinsicstate) {
		System.out.println("具体的Flyweight。1："+ extrinsicstate);
	}
	
}
