package com.gl.spring.core;

public class Passenger {

	private UberGoDriver driver;
	
	public Passenger( UberGoDriver driver) {
		this.driver = driver;
	}
	
	public void Commute(String source, String destination) {
		driver.trip(source, destination);
	}
}
