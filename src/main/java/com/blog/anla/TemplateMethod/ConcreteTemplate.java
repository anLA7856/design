package com.blog.anla.TemplateMethod;
/**
 * 实现primitiveOperation1和primitiveOperation2的方法
 * 以完成算法中特定子类的相关步骤。
 * @author U-ANLA
 *
 */
public class ConcreteTemplate extends TemplateMethod{
	@Override
	public void primitiveOperation1() {
		System.out.println("子类具体方法第一步的实现！");
	}

	@Override
	public void primitiveOperation2() {
		System.out.println("子类具体方法第二步的实现！");
	}
	
}
