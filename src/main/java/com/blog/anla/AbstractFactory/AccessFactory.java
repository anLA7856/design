package com.blog.anla.AbstractFactory;
/**
 * access工厂
 * @author U-ANLA
 *
 */
public class AccessFactory implements Factory{

	@Override
	public UserService createUser() {
		return new AccessUser();
	}

	@Override
	public DepartmentService createDepartment() {
		return new AccessDepartment();
	}
	
}
