package com.blog.anla.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private Map<String,Flyweight> flyweights = new HashMap<String, Flyweight>();
	
	public FlyweightFactory(){
		flyweights.put("X", new ConcreteFlyweight());
		flyweights.put("Y", new ConcreteFlyweight());
		flyweights.put("Z", new ConcreteFlyweight());
	}
	
	public Flyweight getFlyweight(String key){
		return flyweights.get(key);
	}
}
