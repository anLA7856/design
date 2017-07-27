package com.blog.anla.Decorator;
/**
 * concretecomponent是定义了一个具体的对象，
 * 也可以给这个对象添加一些职责
 * @author U-ANLA
 *
 */
public class ConcreteComponent extends Component {

	@Override
	public void operation() {
		System.out.println("operation类的具体操作");
	}

}
