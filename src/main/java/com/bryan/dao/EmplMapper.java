package com.bryan.dao;

import com.bryan.domin.Employee;

import java.util.List;

public interface EmplDao {
	//查询所有员工
	List<Employee> findAll();

	//根据员工编号查找
	Employee findByNum(Integer emplNum);

	//添加员工
	void save(Employee employee);

	//修改员工信息
	void update(Employee employee);

	//删除员工
	void delete(Integer emplNum);
}
