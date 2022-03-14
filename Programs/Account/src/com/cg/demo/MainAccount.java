package com.cg.demo;

public class MainAccount {
	public static void main(String[] args)
	{
		Account a1=new Account(01,"mallu");
		Account a2=new Account("mallikarjun",30000.00);
		Account a3=new Account(02,"mallikarjun warad",40000.00);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	}

}
