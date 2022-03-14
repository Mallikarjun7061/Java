package com.cg.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Testa {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("a");
	}


	@Test
	public void testHello() {
		System.out.println("hello");
	} 
	@AfterAll
	public static void tearDownAfterClass() throws Exception {
		System.out.println("b");

	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("c");

	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("d");

	}

	@Test
	public void testUpdate() {
		System.out.println("e");

	}

}
