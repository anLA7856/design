package com.blog.anla.Decorator;
/**
 * 抽象装饰类，集成了component，利用其来
 * 完成component原有的功能，此外还能够添加
 * 其他的功能，从而扩展原来的component的功能
 * @author U-ANLA
 *
 */
public abstract class Decorator extends Component{

	protected Component component;
	
	public void setComponent(Component component) {
		this.component = component;
	}
	
	@Override
	public void operation() {
		if(component != null){
			component.operation();
		}
	}
	
}
