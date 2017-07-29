package com.blog.anla.Command;
/**
 * 知道如何实施和执行一个请求相关的操作
 * 任何类都可能作为一个接受者。
 * @author U-ANLA
 *
 */
public class Receiver {
	public void ActionA(){
		System.out.println("我是Action A");
	}
	
	public void ActionB(){
		System.out.println("我是Action B");
	}
}
