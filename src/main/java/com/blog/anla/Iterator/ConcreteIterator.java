package com.blog.anla.Iterator;
/**
 * 具体的迭代器
 * @author U-ANLA
 *
 */
public class ConcreteIterator extends Iterator{

	private ConcreteAggregate aggregate;
	private int current = 0;
	
	public ConcreteIterator(ConcreteAggregate aggregate){
		this.aggregate = aggregate;
	}
	
	@Override
	public Object first() {
		return aggregate.getItems().get(0);
	}

	@Override
	public Object next() {
		Object ret = null;
		current++;
		if(current < aggregate.count()){
			ret = aggregate.getItems().get(current);
		}
		return ret;
	}

	@Override
	public boolean isOver() {
		return current >= aggregate.count() ? true : false;
	}

	@Override
	public Object currentItem() {
		return aggregate.getItems().get(current);
	}
	
}
