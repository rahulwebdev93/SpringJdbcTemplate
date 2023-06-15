package com.simplejdbc.Model;

public class Employee {

	private int id;
	private String name;
	private String department;
	private String salary;
        private String Address; 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

}
