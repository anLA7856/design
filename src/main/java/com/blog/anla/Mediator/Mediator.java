package com.blog.anla.Mediator;
/**
 * 定义一个抽象的发送消息方法，
 * 得到同事对象和发送消息
 * @author U-ANLA
 *
 */
public abstract class Mediator {
	public abstract void send(String message,Colleague colleague);
}
