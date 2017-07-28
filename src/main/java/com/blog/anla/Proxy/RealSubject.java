package com.blog.anla.Proxy;
/**
 * 定义proxy所代表的真实实体
 * @author U-ANLA
 *
 */
public class RealSubject extends Subject{

	@Override
	public void request() {
		System.out.println("真实的请求！");
	}
	
}
