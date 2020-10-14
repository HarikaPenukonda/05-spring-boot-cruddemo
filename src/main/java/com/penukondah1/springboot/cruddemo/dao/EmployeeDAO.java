package com.penukondah1.springboot.cruddemo.dao;

import java.util.List;

import com.penukondah1.springboot.cruddemo.entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> findAll();

}
