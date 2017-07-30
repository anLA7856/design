package com.blog.anla.ChainOfResponsibility;

public class ConcreteHandler1 extends Handler{

	@Override
	public void handleRequest(int request) {
		if(request >= 0 && request < 10){
			System.out.println("由handler1处理");
		}else if(successor != null){
			//给上一级去处理
			successor.handleRequest(request);
		}
	}
	
}
