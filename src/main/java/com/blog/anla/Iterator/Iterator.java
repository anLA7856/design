package com.blog.anla.Iterator;
/**
 * 迭代器抽象类，用于定义开始对象，得到下一个对象，判断是否到尾等
 * 抽象方法
 * @author U-ANLA
 *
 */
public abstract class Iterator {
	public abstract Object first();
	public abstract Object next();
	public abstract boolean isOver();
	public abstract Object currentItem();
}
