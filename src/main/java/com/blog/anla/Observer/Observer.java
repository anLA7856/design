package com.blog.anla.Observer;
/**
 * 通知模式（observer）又叫发布订阅模式（Publish/Subscribe）
 * 
 * 抽象观察者，update方法用于从
 * 通知者中获得最新的信息
 * @author U-ANLA
 *
 */
public abstract class Observer {
	public abstract void update();
}
