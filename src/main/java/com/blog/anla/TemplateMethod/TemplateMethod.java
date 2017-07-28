package com.blog.anla.TemplateMethod;
/**
 * 实现了一个模板方法，定义了算法的骨架，
 * 具体子类将重写PrimitiveOperation方法
 * 以实现一个算法的步骤
 * @author U-ANLA
 *
 */
public abstract class TemplateMethod {
	public abstract void primitiveOperation1();
	public abstract void primitiveOperation2();
	
	public void templateMethod(){
		primitiveOperation1();
		System.out.println("先方法1，再方法2，这是顺序！");
		primitiveOperation2();
	}
}
