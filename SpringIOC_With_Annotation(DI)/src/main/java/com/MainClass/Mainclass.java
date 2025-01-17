package com.MainClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Config.ConfigClass;
import com.Entity.Department;
import com.Entity.Employee;

public class Mainclass {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		Employee e = context.getBean(Employee.class);
		
		System.out.println(e);
		 
		
	}

}
