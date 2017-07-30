package com.blog.anla.ChainOfResponsibility;

public class ConcreteHandler3 extends Handler{

	@Override
	public void handleRequest(int request) {
		if(request >= 20 && request < 30){
			System.out.println("由handler3处理");
		}else if(successor != null){
			//给上一级去处理
			successor.handleRequest(request);
		}else{
			System.out.println("这个真处理不了");
		}
	}
	
}
