package com.gl.spring.core;

import org.springframework.stereotype.Component;

@Component
public class UberGoDriver {

	
	public void trip(String source, String destination) {
		System.out.println("Travelling From "+source+ " to " +destination + " by Uber Go !!!!");
	}
}
