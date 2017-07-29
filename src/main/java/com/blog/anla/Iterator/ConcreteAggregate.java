package com.blog.anla.Iterator;

import java.util.ArrayList;
import java.util.List;
/**
 * 具体的待遍历的类
 * @author U-ANLA
 *
 */
public class ConcreteAggregate extends Aggregate {
	private List<Object> items = new ArrayList<Object>();

	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}
	
	public int count(){
		return items.size();
	}

	public List<Object> getItems() {
		return items;
	}

	public void setItems(List<Object> items) {
		this.items = items;
	}
}
