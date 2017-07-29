package com.blog.anla.Composite;
/**
 * 叶子组件，虽然有add和remove方法，
 * 但是只是个头，实际无方法体，可以理解为没有
 * 这项操作。
 * @author U-ANLA
 *
 */
public class Leaf extends Component{

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void Add(Component c) {
		System.out.println("叶子无法添加叶子");
	}

	@Override
	public void remove(Component c) {
		System.out.println("叶子无法删除叶子");
	}

	@Override
	public void display(int depth) {
		System.out.println(new String("-depth")+name);
	}
	
}
