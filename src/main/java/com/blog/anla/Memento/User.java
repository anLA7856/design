package com.blog.anla.Memento;
/**
 * 客户端测试
 * @author U-ANLA
 *
 */
public class User {
	public static void main(String[] args) {
		Originator o = new Originator();
		o.setState("On");
		o.show();
		
		Caretaker c = new Caretaker();
		c.setMemento(o.createMemento());
		
		o.setState("Off");
		o.show();
		
		o.setMemento(c.getMemento());
		o.show();
	}
}
