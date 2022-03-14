package com.cg.demo;

public class Airtel implements Sim{
	
	public Airtel() {
		System.out.println(" airtel condtr called ");
	}

	@Override
	public void calling() {
		System.out.println("calling using airtel mobile ");
		
	}

	@Override
	public void data() {
		System.out.println("browsing internet useing airtel sim");
		
	}
	

}
