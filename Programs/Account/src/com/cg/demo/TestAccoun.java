package com.cg.demo;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.ClassOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

public class TestAccoun {
	
	Account a1=new Account(01,"mallu");
	Account a2=new Account("mallikarjun",30000.00);
	Account a3=new Account(02,"mallikarjun warad",40000.00);
     
   
	@Test
    @Order(6)
	public void testGetsalary() {
		assertEquals(40000.00,a3.getSalary());
	}
	
	@Test
    @Order(87)
	public void testno() {
		assertEquals(02,a3.getNo());
	}
	@Test
    @Order(4)
	public void testGetname() {
		assertEquals("mallikarjun warad",a3.getName());
	}
}