package com.blog.anla.AbstractFactory;

public class SqlserverDepartment implements DepartmentService{

	@Override
	public void insert(Department department) {
		System.out.println("在 sqlserver中插入department！");
	}

}
