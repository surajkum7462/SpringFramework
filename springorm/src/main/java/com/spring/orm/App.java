package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
       
		/*
		 * StudentDao sd= context.getBean("studentDao",StudentDao.class);
		 * 
		 * Student st=new Student(5454,"Suraj Kumar","Jharkhand");
		 * 
		 * int r=sd.insert(st);
		 * 
		 * System.out.println("Done:"+r);
		 */
       StudentDao studentDao =context.getBean("studentDao",StudentDao.class);
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       boolean go = true;
       while(go)
       {
    	   System.out.println("Press 1 for add new student");
           System.out.println("Press 2 for display all student");
           System.out.println("Press 3 for get details of single student");
           System.out.println("Press 4 for delete student");
           System.out.println("Press 5 for update student");
           System.out.println("Press 6 for exit");
           
           try
           {
        	   System.out.println("Enter your choice");
        	int input =   Integer.parseInt(br.readLine());
        	
        	switch(input)
        	{
        	case 1:
        		// Add a new Student
        		System.out.println("Enter student id");
        		int id= Integer.parseInt(br.readLine());
        		System.out.println("Enter Student name");
        		String name=br.readLine();
        		System.out.println("Enter State Name:");
        		String city=br.readLine();
        		
        		
        		StudentDao sd= context.getBean("studentDao",StudentDao.class);
        		Student st = new Student();
        		st.setId(id);
        		st.setName(name);
        		st.setCity(city);
        		int r = sd.insert(st);
        		System.out.println("Done:"+r);
        		break;
        	case 2:
        		//display all Student detail
        		List<Student> list =studentDao.getAllStudents();
        		for(Student std:list)
        		{
        			System.out.println(std);
        		}
        		break;
        	case 3:
        		//get single student data
        		System.out.println("Enter Student Id");
        		int stId = Integer.parseInt(br.readLine());
        		Student st1=studentDao.getStudent(stId);
        		System.out.println(st1);
        		break;
        	case 4:
        		//for delete operation
        		System.out.println("Enter Student Id for deletion");
        		int stDel = Integer.parseInt(br.readLine());
        		studentDao.delete(stDel);
        		break;
        	case 5:
        		//update student
        		System.out.println("Enter Student Id for updating");
        		int stU = Integer.parseInt(br.readLine());
        		Student sdU=new Student();
        		sdU.setId(stU);
        		System.out.println("Please enter name for edition");
        		String sName=br.readLine();
        		sdU.setName(sName);
        		System.out.println("Please enter city name for edition");
        		String sCity=br.readLine();
        		sdU.setCity(sCity);
        		studentDao.updateStudent(sdU);
        		
        		break;
        	case 6:
        		go=false;
        		break;
        		
        	}
        		
        	
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
           }catch(Exception e)
           {
        	   System.out.println("Invalid input");
        	   System.out.println(e.getMessage());
           }
       }
       
      System.out.println("Thank you for using my application");
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    }
}
