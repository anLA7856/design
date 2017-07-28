package com.blog.anla.Facade;
/**
 * Facade外观类，知道那些子系统类负责处理
 * 请求，将客户的请求代理给适当的子系统对象
 * @author U-ANLA
 *
 */
public class Facade {
	private SubSystemOne one;
	private SubSystemTwo two;
	private SubSystemThree three;
	private SubSystemFour four;
	
	public Facade(){
		one = new SubSystemOne();
		two = new SubSystemTwo();
		three = new SubSystemThree();
		four = new SubSystemFour();
	}
	
	public void methodA(){
		System.out.println("集成方法A");
		one.methodOne();
		two.methodTwo();
		three.methodThree();
	}
	
	public void methodB(){
		System.out.println("集成方法B");
		three.methodThree();
		four.methodFour();
		one.methodOne();
	}
}
