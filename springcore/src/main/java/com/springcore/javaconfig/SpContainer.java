package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig") //
public class SpContainer {
	
	@Bean
	public Dependency getDepend()
	{
		return new Dependency();
	}
	
	
	
	@Bean(name= {"student","temp","con"}) //we can give the name 
	public Student getStudent()
	{
		
		//creating a new object
		Student s=new Student(getDepend());
		return s;
	}

}
