package com.blog.anla.AbstractFactory;

public class SqlserverUser implements UserService{

	@Override
	public void insert(User user) {
		System.out.println("在sqlserver中 插入user表");
	}

}
