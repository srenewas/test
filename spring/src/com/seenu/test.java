package com.seenu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class test{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		student student = (com.seenu.student) context.getBean("stud");
		address address = new address("mncl", "india");

		student.display();
		
		
	}
}