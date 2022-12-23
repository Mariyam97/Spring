package com.gl.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		UberGoDriver bibi = new UberGoDriver();
		Passenger mariyam = new Passenger(bibi);
		mariyam.Commute("Bangalore", "Bijapur");
		*/
		
		
	//	Spring will scan the file and start creating the object.
	// After the object is created , the bean will be registered inside the application context.
		//we can request the bean from the application context with the bean name.
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/application-context.xml");
		Passenger mariyam = applicationContext.getBean("passenger",Passenger.class);
		mariyam.Commute("Bangalore", "Bijapur");
	}

}
