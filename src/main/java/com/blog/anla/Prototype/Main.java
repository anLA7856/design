package com.blog.anla.Prototype;
/**
 * 测试的深复制浅复制类，很明显，两个输出不同
 * 浅复制只会复制基本类型，而对于引用类型，则是直接给指向的应用
 * 而深复制除了可以复制基本类型外，还能够复制一套引用类型变量。
 * @author U-ANLA
 *
 */
public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		//浅复制
		PrototypeA pa = new PrototypeA();
		pa.setNum1(5);
		pa.setNum2(6);
		pa.getPeople().setAge(25);
		pa.getPeople().setName("Jack");
		PrototypeA pa1 = (PrototypeA)pa.clone();
		//修改pa1的值而不修改pa2的相关值。
		pa1.getPeople().setAge(23);
		pa1.setNum1(4);
		//对比结果
		System.out.println(pa);
		System.out.println(pa1);
		/**
		 * 输出结果：
		 * PrototypeA [num1=5, num2=6, people=People [name=Jack, age=23]]
		 * PrototypeA [num1=4, num2=6, people=People [name=Jack, age=23]]
		 */
		System.out.println();
		System.out.println();
		
		
		
		//深复制
		PrototypeB pb = new PrototypeB();
		pb.setNum1(5);
		pb.setNum2(6);
		pb.getPeople().setAge(25);
		pb.getPeople().setName("Jack");
		PrototypeB pa2 = (PrototypeB)pb.clone();
		//修改pa1的值而不修改pa2的相关值。
		pa2.getPeople().setAge(23);
		pa2.getPeople().setName("Tom");
		pa2.setNum1(4);
		//对比结果
		System.out.println(pb);
		System.out.println(pa2);
		/**
		 * 输出结果：
		 * PrototypeB [num1=5, num2=6, people=People [name=Jack, age=25]]
		 * PrototypeB [num1=4, num2=6, people=People [name=Tom, age=23]]
		 */
		
	}
}
