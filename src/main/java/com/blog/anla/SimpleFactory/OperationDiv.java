package com.blog.anla.SimpleFactory;

public class OperationDiv extends Operation{

	@Override
	public double getResult() {
		if(numberB != 0){
			return numberA / numberB;
		}else{
			return 0;
		}
	}
	
}
