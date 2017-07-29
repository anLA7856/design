package com.blog.anla.Command;

import java.util.ArrayList;
import java.util.List;
/**
 * 就像个外包装的服务员，负责执行命令。
 * @author U-ANLA
 *
 */
public class Invoker {
	private List<Command> commands = new ArrayList<Command>();
	
	public void addCommand(Command command) {
		this.commands.add(command);
	}
	
	public void executeCommand(){
		for(int i = 0;i < commands.size();i++){
			commands.get(i).execute();
		}
	}
	
	public void cancelCommand(Command command){
		commands.remove(command);
	}
}
