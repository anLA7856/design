package com.blog.anla.SimpleFactory;
/**
 * 简单工厂，需要啥类就考虑用一个
 * 单独的类来创造示例工程。
 * 降低了功能类之间的耦合性，如果要添加一个新功能，
 * 仅仅需要加相应的类，而不需要更改其他的类
 * @author U-ANLA
 *
 */
public class OperationFactory {
	public static Operation createOperate(char operate){
		Operation oper = null;
		switch (operate) {
		case '+':
			oper = new OperationAdd();
			break;
		case '-':
			oper = new OperationSub();
			break;
		case '*':
			oper = new OperationMul();
			break;
		case '/':
			oper = new OperationDiv();
			break;
		}
		return oper;
	}
	
	public static void main(String[] args) {
		Operation oper = OperationFactory.createOperate('+');
		oper.numberA = 1;
		oper.numberB = 2;
		System.out.println(oper.getResult());
	}
}
