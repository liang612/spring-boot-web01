package com.bryan.service;

import com.bryan.domin.Employee;

import java.util.List;

public interface EmplService {
	//查询所有员工
	List<Employee> findAll();
	//添加员工
	void save(Employee employee);
}
