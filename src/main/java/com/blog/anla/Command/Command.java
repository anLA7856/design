package com.blog.anla.Command;
/**
 * 用来声明执行操作的接口
 * @author U-ANLA
 *
 */
public abstract class Command {
	protected Receiver receiver;
	
	public Command(Receiver receiver){
		this.receiver = receiver;
	}
	
	abstract public void execute();
}
