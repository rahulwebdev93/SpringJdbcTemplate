package com.simplejdbc.Dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.simplejdbc.Model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

//	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
//		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void save(Employee person) {

		String query = "insert into person (name, department,salary) values (?, ?,?)";
		Object[] args = new Object[] { person.getName(), person.getDepartment(), person.getSalary() };

		int out = jdbcTemplate.update(query, args);

	}

	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	public void update(Long id) {
		// TODO Auto-generated method stub

	}

	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
