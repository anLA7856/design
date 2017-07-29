package com.blog.anla.Memento;
/**
 * 管理者，得到或者设置备忘录
 * 但是没有生成memento的权限。
 * @author U-ANLA
 *
 */
public class Caretaker {
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
	
}
