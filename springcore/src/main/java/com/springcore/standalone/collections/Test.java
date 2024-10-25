package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
             Person p1=context.getBean("person1",Person.class); 
             System.out.println(p1);
             System.out.println(p1.getFriends().getClass().getName());
             System.out.println("_________________________________________");
             System.out.println(p1.getFeestructure());
             System.out.println(p1.getFeestructure().getClass().getName());
             System.out.println("_________________________________________");
             System.out.println(p1.getProps());
             
             
           
	}

}
