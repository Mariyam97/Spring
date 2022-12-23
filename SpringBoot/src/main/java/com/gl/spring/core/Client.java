package com.gl.spring.core;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UberGoDriver bibi = new UberGoDriver();
		Passenger mariyam = new Passenger(bibi);
		mariyam.Commute("Bangalore", "Bijapur");
		
	}

}
