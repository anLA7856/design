package com.blog.anla.Proxy;
/**
 * 代理类，封装和隐藏真实物体的行为，
 * 这里主要是隐藏realsubjec类的行为。
 * 同样继承自subject，可以理解成代理，所以要有同样的
 * 动作嘛。
 * @author U-ANLA
 *
 */
public class Proxy extends Subject{

	private RealSubject realSubject;
	@Override
	public void request() {
		synchronized(this) {
			if(realSubject == null){
				realSubject = new RealSubject();
			}
		}
		realSubject.request();
	}
	
}
