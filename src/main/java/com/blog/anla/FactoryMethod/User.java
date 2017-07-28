package com.blog.anla.FactoryMethod;
/**
 * 测试类，main方法
 * 工厂方法和简单方法的不同之处在于
 * 1、工厂方法又向上抽象出来了一层，也就是把运算类从工厂里面抽出来了
 * 		因而工厂只用于生产
 * 2、将switch的语句，从工厂里面抽出来了，放到了客户端的User类里面。
 * @author U-ANLA
 *
 */
public class User {
	public static void main(String[] args) {
		Factory factory = myOperation('+');
		Operation operation = factory.createOperation();
		operation.numberA = 1;
		operation.numberB = 2;
		System.out.println(operation.getResult());
	}
	
	public static Factory myOperation(char operation){
		switch (operation) {
		case '+':
			return new AddFactory();
		case '-':
			return new SubFactory();
		case '*':
			return new MulFactory();
		case '/':
			return new DivFactory();
		default:
			//默认
			return new AddFactory();
		}
	}
}
