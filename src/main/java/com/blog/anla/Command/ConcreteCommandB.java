package com.blog.anla.Command;

public class ConcreteCommandB extends Command{

	public ConcreteCommandB(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		receiver.ActionB();
	}
	
}
