package com.blog.anla.Composite;
/**
 * Component为组合中对象声明接口，在适当情况下，实现
 * 所有类共有接口的默认行为。声明一个接口用于访问和管理
 * Component的子部件。
 * @author U-ANLA
 *
 */
public abstract class Component {
	protected String name;
	public Component(String name){
		this.name = name;
	}
	
	public abstract void Add(Component c);
	public abstract void remove(Component c);
	public abstract void display(int depth);
}
