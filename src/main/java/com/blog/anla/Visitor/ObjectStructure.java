package com.blog.anla.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 能枚举它的元素，可以提供一个高层接口以允许访问者访问
 * 它的元素。
 * @author U-ANLA
 *
 */
public class ObjectStructure {
	private List<Element> elements = new ArrayList<Element>();
	
	public void attach(Element element){
		elements.add(element);
	}
	
	public void detach(Element element){
		elements.remove(element);
	}
	
	public void accept(Visitor visitor){
		for(int i = 0;i < elements.size();i++){
			elements.get(i).accept(visitor);
		}
	}
}
