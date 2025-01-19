package com.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

	//Using @Qualifier annotation to solve Ambiguity problem  
	
	@Qualifier("Airtel") // Spring will inject Airtel 
	@Autowired
	private Sim sim1;
	 
	@Qualifier("Jio")  // here Spring will inject Jio
	@Autowired
	private Sim sim2;
	public Sim getSim1() {
		return sim1;
	}
	public void setSim1(Sim sim1) {
		this.sim1 = sim1;
	}
	public Sim getSim2() {
		return sim2;
	}
	public void setSim2(Sim sim2) {
		this.sim2 = sim2;
	}
	public Person(Sim sim1, Sim sim2) {
		super();
		this.sim1 = sim1;
		this.sim2 = sim2;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [sim1=" + sim1 + ", sim2=" + sim2 + "]";
	}
	
	
	
	
}
