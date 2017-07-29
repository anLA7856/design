package com.blog.anla.AbstractFactory;

public class AccessDepartment implements DepartmentService{

	@Override
	public void insert(Department department) {
		System.out.println("在 access中插入department！");		
	}

}
