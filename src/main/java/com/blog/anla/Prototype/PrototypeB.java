package com.blog.anla.Prototype;
/**
 * 原型模式，以深复制为例
 * @author U-ANLA
 *
 */
public class PrototypeB {
	private int num1 = 0;
	private int num2 = 0;

	private People people;
	
	public PrototypeB(){
		people = new People();
	}

	@Override
	protected PrototypeB clone() throws CloneNotSupportedException {
		//新创建了一个对象并返回
		PrototypeB pb = new PrototypeB();
		pb.num1 = this.num1;
		pb.num2 = this.num2;
		pb.people = pb.people;
		return (PrototypeB)pb;
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
		return "PrototypeB [num1=" + num1 + ", num2=" + num2 + ", people="
				+ people + "]";
	}

}
