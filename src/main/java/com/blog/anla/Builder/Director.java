package com.blog.anla.Builder;
/**
 * 指挥者类，用来指挥建造过程
 * @author U-ANLA
 *
 */
public class Director {
	public void construct(Builder builder){
		builder.buildPartA();
		builder.buildPartB();
	}
}
