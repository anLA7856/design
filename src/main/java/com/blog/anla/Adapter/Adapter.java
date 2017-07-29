package com.blog.anla.Adapter;

public class Adapter extends Target{
	private Adaptee adaptee = new Adaptee();
	
	@Override
	public void request(){
		adaptee.specificRequest();
	}
}
