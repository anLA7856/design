package com.blog.anla.ChainOfResponsibility;
/**
 * 客户端代码，用于实践职责链模式
 * @author U-ANLA
 *
 */
public class Client {
	public static void main(String[] args) {
		ConcreteHandler1 h1 = new ConcreteHandler1();
		ConcreteHandler2 h2 = new ConcreteHandler2();
		ConcreteHandler3 h3 = new ConcreteHandler3();
		 
		//设置上司，即设置下一级
		h1.setSuccessor(h2);
		h2.setSuccessor(h3);
		
		int[] requests = {2,5,14,30,13,22};
		for(int i = 0;i < requests.length;i++){
			//先给h1处理，会一步步下去。
			h1.handleRequest(requests[i]);
		}
	}
}
