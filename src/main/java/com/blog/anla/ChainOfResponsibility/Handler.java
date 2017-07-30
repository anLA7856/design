package com.blog.anla.ChainOfResponsibility;
/**
 * 定义一个处理请示的抽象类，
 * 实现这个接口的即都可以处理请求。
 * @author U-ANLA
 *
 */
public abstract class Handler {
	protected Handler successor;
	
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	/**
	 * 具体处理方法，有相应子类去实现
	 * @param request
	 */
	public abstract void handleRequest(int request);
}
