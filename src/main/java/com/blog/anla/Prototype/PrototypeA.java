package com.blog.anla.Prototype;

/**
 * 原型类，声明一个克隆自身的接口 以浅复制为例
 * @author U-ANLA
 *
 */
public class PrototypeA implements Cloneable {

	private int num1 = 0;
	private int num2 = 0;

	private People people;
	
	public PrototypeA(){
		people = new People();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//并没有对people这个引用对象进行特殊处理
		return (Object) super.clone();
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}

	@Override
	public String toString() {
		return "PrototypeA [num1=" + num1 + ", num2=" + num2 + ", people="
				+ people + "]";
	}
}
