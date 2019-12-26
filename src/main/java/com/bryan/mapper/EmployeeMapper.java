package com.bryan.mapper;

import com.bryan.domin.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

//指定这是一个操作数据库的mapper

public interface EmployeeMapper {

	//查找所有员工
	@Select("select * from employee")
	List<Employee> findAll();

	//根据员工编号查找
	@Select("select * from employee where emplNum=#{emplNum}")
	Employee findByNum(Integer emplNum);

	//添加员工
	@Insert("insert into employee(emplNum,emplName,duty,sex,age,address) " +
			"values (#{emplNum},#{emplName},#{duty},#{sex},#{age},#{address})")
	void save(Employee employee);

	//修改员工信息
	@Update("UPDATE employee SET emplName=#{emplName},duty=#{duty},sex=#{sex}," +
			"age=#{age},address=#{address} WHERE emplNum=#{emplNum}")
	void update(Employee employee);

	//删除员工
	@Delete("DELETE FROM employee WHERE emplNum=#{emplNum}")
	void delete(Integer emplNum);
}
