package com.cg.demo;

public class Account {
private int no;
private String name;
private double salary;

public Account(int no,String name)
{
	this.no=no;
	this.name=name;
}

public Account (String name,double salary)
{
	this.name=name;
	this.salary=salary;
}

public Account (int no,String name,double salary)
{
	this.no=no;
	this.name=name;
	this.salary=salary;
}

public int getNo() {
	return no;
}

public void setNo(int no) {
	this.no = no;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Account [no=" + no + ", name=" + name + ", salary=" + salary + "]";
}

}
