package com.cg.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class hellocontroller {

	
	@RequestMapping("/hello")
	public String sayHi()
	{
		return "Hiii";
	}
}
