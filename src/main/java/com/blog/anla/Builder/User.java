package com.blog.anla.Builder;
/**
 * 客户端类
 * @author U-ANLA
 *
 */
public class User {
	public static void main(String[] args) {
		Director director = new Director();
		Builder b1 = new ConcreteBuilder1();
		Builder b2 = new ConcreteBuilder2();
		director.construct(b1);
		Product p1 = b1.getResult();
		p1.show();
		
	}
}
