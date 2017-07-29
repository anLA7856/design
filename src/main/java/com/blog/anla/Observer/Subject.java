package com.blog.anla.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 它把所有对观察者对象的引用保存在一个聚集里，每个主题都可以有任何数量的观察者
 * 抽象主题提供一个接口，可以增加和删除观察者对象
 * @author U-ANLA
 *
 */
public abstract class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	public void detach(Observer observer){
		observers.remove(observer);
	}
	/**
	 * 通知每一个观察者
	 */
	public void myNotify(){
		for(int i = 0;i < observers.size();i++){
			observers.get(i).update();
		}
	}
}
