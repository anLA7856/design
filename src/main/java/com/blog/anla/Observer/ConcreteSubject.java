package com.blog.anla.Observer;
/**
 * 具体主题或者具体主题统治者，将有关状态存入具体观察者
 * 对象，在具体主题的内部状态改变时，给所有登记过的观察者发出通知
 * @author U-ANLA
 *
 */
public class ConcreteSubject extends Subject{
	private String subjectState;
	public String getSubjectState() {
		return subjectState;
	}
	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}
}
