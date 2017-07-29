package com.blog.anla.Composite;

import java.util.ArrayList;
import java.util.List;
/**
 * Composite的定义有行为，可以增加或者删除下面的节点。
 * @author U-ANLA
 *
 */
public class Composite extends Component{

	private List<Component> children = new ArrayList<Component>();
	
	public Composite(String name) {
		super(name);
	}

	@Override
	public void Add(Component c) {
		children.add(c);
	}

	@Override
	public void remove(Component c) {
		children.remove(c);
	}

	@Override
	public void display(int depth) {
		System.out.println("-"+depth+name);
		for(int i = 0;i < children.size();i++){
			children.get(i).display(depth+2);
		}
	}
	
}
