package com.cg.demo;

public class Student {

	private int id;
	private String studentName;

    public Student(int id)

    {
    	this.id=id;
    }
    
	public Student(int id,String name) {
		
		this.id = id;
		this.studentName = name;
	}


	public void displayStudentInfo()
	{
		System.out.println(" id is :" + id+" student name is: "+studentName);
	}
}
