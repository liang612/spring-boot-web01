package com.bryan.controller;

import com.bryan.domin.Employee;
import com.bryan.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public final class EmployeeController {
	@Autowired
	private EmployeeMapper employeeMapper;

	//查询所有员工返回列表
	@GetMapping("/emps")
	public final String list(Model model) {
		List<Employee> employees = employeeMapper.findAll();
		//把员工数据存入Request域
		model.addAttribute("emps", employees);
		return "emp/list";
	}


	//根据员工编号查找(跳转到add.html页面)
	@GetMapping(value = {"/emp/{emplNum}"})
	public final ModelAndView findByNum(@PathVariable("emplNum") Integer emplNum) {
		Employee employee = employeeMapper.findByNum(emplNum);
		ModelAndView mv = new ModelAndView();
		mv.addObject("empl", employee);
		mv.setViewName("emp/add");
		return mv;
	}

	//修改员工信息
	@PutMapping("/emp")
	public final String update(Employee employee) {
		employeeMapper.update(employee);
		return "redirect:/emps";
	}

	//跳转到添加员工页面
	@GetMapping("/emp")
	public final String toAdd() {
		return "emp/add";
	}

	//添加员工
	@PostMapping("/emp")
	public final String add(Employee employee) {
		employeeMapper.save(employee);
		//redirect重定向 return "redirect:success.html"
		return "redirect:/emps";
	}

	//删除员工
	@DeleteMapping("/emp/{emplNum}")
	public final String delete(@PathVariable("emplNum") Integer emplNum) {
		employeeMapper.delete(emplNum);
		return "redirect:/emps";
	}
}
