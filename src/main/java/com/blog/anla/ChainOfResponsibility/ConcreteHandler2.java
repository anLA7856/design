package com.blog.anla.ChainOfResponsibility;

public class ConcreteHandler2 extends Handler{

	@Override
	public void handleRequest(int request) {
		if(request >= 10 && request < 20){
			System.out.println("由handler2处理");
		}else if(successor != null){
			//给上一级去处理
			successor.handleRequest(request);
		}
	}

}
