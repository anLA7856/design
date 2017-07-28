package com.blog.anla.Prototype;
/**
 * 模板类，用来测试并区分浅复制和深复制。
 * @author U-ANLA
 *
 */
public class People {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + "]";
	}
	public People(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public People() {

	}
	
	
}
