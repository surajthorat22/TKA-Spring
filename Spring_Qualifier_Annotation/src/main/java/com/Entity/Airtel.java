package com.Entity;

import org.springframework.stereotype.Component;

@Component("Airtel")
public class Airtel implements Sim{


	@Override
	public String calling() {
		return "Calling From Airtel";
	}
	
	

}
