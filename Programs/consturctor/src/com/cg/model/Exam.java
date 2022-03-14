package com.cg.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Exam {


	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Student m  = context.getBean("student", Student.class);
		m.displayStudentInfo();


	}
}
