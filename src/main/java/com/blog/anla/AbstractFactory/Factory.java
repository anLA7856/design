package com.blog.anla.AbstractFactory;
/**
 * 工厂接口
 * @author U-ANLA
 *
 */
public interface Factory {
	public UserService createUser();
	public DepartmentService createDepartment();
}
