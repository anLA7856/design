package com.blog.anla.Interpreter;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		
		List<AbstractExpression> list = new ArrayList<AbstractExpression>();
		list.add(new TerminalExpression());
		list.add(new NonterminalExpression());
		list.add(new TerminalExpression());
		list.add(new TerminalExpression());
		//一一执行
		for(int i = 0;i < list.size();i++){
			list.get(i).interpret(context);
		}
	}
}
