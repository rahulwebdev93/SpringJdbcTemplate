package com.simplejdbc.Dao;

import java.util.List;

import com.simplejdbc.Model.Employee;


public interface EmployeeDao {

	public void save(Employee person);

	public void delete(Long id);

	public void update(Long id);

	public List<Employee> getAll();

}
