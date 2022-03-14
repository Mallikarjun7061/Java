package com.cg.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		/*Student student =new Student();
    MathCheat cheat = new MathCheat();
    student.setMathCheat(cheat);
    student.cheating();*/

		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans.xml file loaded");
        Student student = context.getBean("stu",Student.class);
        student.cheating();
        
        AnotherStudent anotherstudent=context.getBean("anotherstudent",AnotherStudent.class);
        anotherstudent.startCheating();
	}

}
