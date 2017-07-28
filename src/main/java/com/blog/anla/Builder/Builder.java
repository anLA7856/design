package com.blog.anla.Builder;
/**
 * 抽象的建造者类，确定产品由两个部件组成
 * 以及得到产品的方法getResult
 * @author U-ANLA
 *
 */
public abstract class Builder {
	public abstract void buildPartA();
	public abstract void buildPartB();
	public abstract Product getResult();
}
