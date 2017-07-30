package com.blog.anla.Visitor;

/**
 * 元素的抽象父类，
 * 一般的情况下，当使用访问者模式时，
 * 要求他的子类是基本固定的，不要随意更改的。
 * @author U-ANLA
 *
 */
public abstract class Element {
	public abstract void accept(Visitor visitor);
}
