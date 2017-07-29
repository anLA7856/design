package com.blog.anla.Command;
/**
 * 将一个接受者对象绑定与一个动作，
 * 调用接受者相应的操作，以实现Execute
 * @author U-ANLA
 *
 */
public class ConcreteCommandA extends Command{

	
	public ConcreteCommandA(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		receiver.ActionA();
	}

}
