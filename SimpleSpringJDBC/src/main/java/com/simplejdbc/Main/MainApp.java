package com.simplejdbc.Main;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.simplejdbc.Dao.EmployeeDao;
import com.simplejdbc.Dao.EmployeeDaoImpl;
import com.simplejdbc.Model.Employee;

public class MainApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("sqlmap.xml");

		EmployeeDaoImpl employeeDaoimpl = ctx.getBean("EmployeeDaoImpl", EmployeeDaoImpl.class);

		Employee emp = new Employee();
		emp.setName("papa");
		emp.setDepartment("it");
		emp.setSalary("1000");
		
		employeeDaoimpl.save(emp);

	}
}