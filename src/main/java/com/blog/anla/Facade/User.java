package com.blog.anla.Facade;
/**
 * 客户端类，使用Facade的类
 * @author U-ANLA
 *
 */
public class User {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.methodA();
		facade.methodB();
	}
}
