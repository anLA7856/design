package com.blog.anla.Memento;

/**
 * 发起人类，保存多个属性， 可以创建备忘录，回复备忘录等等
 * 
 * @author U-ANLA
 *
 */
public class Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memento createMemento() {
		return new Memento(state);
	}

	public void setMemento(Memento memento) {
		state = memento.getState();
	}

	public void show() {
		System.out.println("state:" + state);
	}
}
