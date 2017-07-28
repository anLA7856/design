package com.blog.anla.Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体产品
 * @author U-ANLA
 *
 */
public class Product {
	List<String> parts = new ArrayList<String>();
	
	public void add(String part){
		parts.add(part);
	}
	
	public void show(){
		System.out.println("产品  已创建");
		for(int i = 0;i < parts.size();i++){
			System.out.println(parts.get(i));
		}
	}
}
