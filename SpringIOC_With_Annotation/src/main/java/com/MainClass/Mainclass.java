package com.MainClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Config.ConfigClass;
import com.Entity.Employee;

public class Mainclass {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		Employee e = context.getBean(Employee.class);
		
		e.setEid(1);
		e.setEname("Sahil Babar");
		e.setSalary(100);
		System.out.println(e);
		 
		
	}

}
