package com.blog.anla.AbstractFactory;
/**
 * sqlserver工厂
 * @author U-ANLA
 *
 */
public class SqlserverFactory implements Factory{

	@Override
	public UserService createUser() {
		return new SqlserverUser();
	}

	@Override
	public DepartmentService createDepartment() {
		return new SqlserverDepartment();
	}

}
