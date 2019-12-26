package com.bryan.dao;

import com.bryan.domin.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmplDao {
	//查询所有员工
	List<Employee> findAll();

	//添加员工
	void save(Employee employee);
}
