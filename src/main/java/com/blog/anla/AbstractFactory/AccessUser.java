package com.blog.anla.AbstractFactory;

public class AccessUser implements UserService{
	@Override
	public void insert(User user) {
		System.out.println("在access中插入user表");
	}

}
