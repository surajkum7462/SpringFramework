package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext con = 
				             new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		
		 
		Student student=con.getBean("student",Student.class);
		System.out.println(student);
		System.out.println(student);
        System.out.println("___________________________-");
		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getClass().getName());
		
		System.out.println("_________Bean Scope______________");
		System.out.println(student.hashCode());
		
		Student student2=con.getBean("student",Student.class);
		
		System.out.println(student2.hashCode());
		
		System.out.println("-----------Teacher HashCode--------------");
		
		Teacher t1=con.getBean("teacher",Teacher.class);
		Teacher t2=con.getBean("teacher",Teacher.class);
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}

}
