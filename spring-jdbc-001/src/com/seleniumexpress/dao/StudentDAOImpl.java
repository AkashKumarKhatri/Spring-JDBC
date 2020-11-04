package com.seleniumexpress.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.seleniumexpress.api.Student;

public class StudentDAOImpl implements StudentDAO {

	
	private JdbcTemplate jdbcTemplate; //= new JdbcTemplate(getDataSource());
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insert(Student student) {
		
		String sql = "INSERT INTO STUDENT VALUES (?,?,?)";
		
		Object[] arg = {student.getRollNo(), student.getName(), student.getAddress()};
		
		
		
		int noOfRows = jdbcTemplate.update(sql, arg);
		
		System.out.println("No of rows inserted is " + noOfRows);
		
	}
	
	
	// Ye is liye comment kiya hy k hum same kaam ab beans.xml file se kr rahy hn
	
	/*
	 * public DataSource getDataSource() { String url =
	 * "jdbc:mysql://localhost:3306/school?useSSL=false"; String password = "ptcl";
	 * String username = "root";
	 * 
	 * DataSource dataSource = new DriverManagerDataSource(url, username, password);
	 * 
	 * return dataSource; }
	 */
	
}
