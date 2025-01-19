package com.Entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mainclass {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Person p = context.getBean(Person.class);
		System.out.println(p.getSim1().calling());
		System.out.println(p.getSim2().calling());
		
	}

}
