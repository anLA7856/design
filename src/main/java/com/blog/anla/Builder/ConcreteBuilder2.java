package com.blog.anla.Builder;
/**
 * 具体建造者类
 * @author U-ANLA
 *
 */
public class ConcreteBuilder2 extends Builder{

	private Product product = new Product();
	
	@Override
	public void buildPartA() {
		product.add("部件X");
	}

	@Override
	public void buildPartB() {
		product.add("部件Y");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
