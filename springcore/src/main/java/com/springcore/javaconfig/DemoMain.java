package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(SpContainer.class);
		Student s1=context.getBean("con",Student.class);
		System.out.println(s1);
		s1.study();
		
		
	}

}
