package com.blog.anla.Flyweight;

public class ConcreteFlyweight2 extends Flyweight{

	@Override
	public void operation(int extrinsicstate) {
		System.out.println("不共享的具体的Flyweight。2："+ extrinsicstate);
	}
	
}
