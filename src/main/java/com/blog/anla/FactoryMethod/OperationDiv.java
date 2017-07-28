package com.blog.anla.FactoryMethod;
/**
 * 除法运算
 * @author U-ANLA
 *
 */
public class OperationDiv extends Operation{
	@Override
	public double getResult() {
		if(numberB == 0){
			return 0;
		}else{
			return numberA / numberB;
		}
	}
	
}
