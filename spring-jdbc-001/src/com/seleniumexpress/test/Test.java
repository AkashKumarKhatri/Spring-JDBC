package com.seleniumexpress.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seleniumexpress.api.Student;
import com.seleniumexpress.dao.StudentDAO;
import com.seleniumexpress.dao.StudentDAOImpl;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("application context loaded..");
		
		StudentDAO studentDAO = context.getBean("studentDao", StudentDAO.class);
		
		Student newStudent1 = new Student();
		newStudent1.setRollNo(004);
		newStudent1.setName("Khalid");
		newStudent1.setAddress("Karachi");
		
		studentDAO.insert(newStudent1);
		
		//StudentDAO studentDAO = new StudentDAOImpl();
		//studentDAO.insert(newStudent1);
	}

}
