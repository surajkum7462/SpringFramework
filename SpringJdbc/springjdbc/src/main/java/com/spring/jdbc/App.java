package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program Started" );
        
        // Spring jdbc =>jdbcTemplate
//        @SuppressWarnings("resource")
//		ApplicationContext context = 
//        		   new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
//        
//       JdbcTemplate template= context.getBean("jdbcTemplate",JdbcTemplate.class);
       //insert query
      // String query="insert into student(id,name,city) values (?,?,?)";
       
       //fire query(insert data-1)
//       int result = template.update(query,456,"Rahul Kumar","Mumbai");
//       System.out.println("Number of record inserted.."+result);
       
      //StudentDao studentDao =context.getBean("studentdao",StudentDao.class);
      
       //inserting the data into database(data -2)
//      Student student=new Student();
//      student.setId(999);
//      student.setName("Bittu");
//      student.setCity("Janchpur");
////      		
//      int result=studentDao.insert(student);
//     System.out.println("Student added:"+result);
       
       //updating the data
      
//      Student st=new Student();
//      st.setId(222);
//      st.setName("Suraj Raj");
//      st.setCity("Patia");
//      int r=studentDao.change(st);
//      System.out.println("Data Changed:"+r);
      
      
      // deleting data
//      Student st=new Student();
//      st.setId(5454);
//      int r=studentDao.delete(st);
//      System.out.println("Deleted Data:"+r);
      
      // selecting one data
//     Student student= studentDao.getStudent(456);
//     System.out.println(student);
      
      // Getting all data from students
      
//     List<Student> students= studentDao.getAllStudents();
//     for(Student s:students)
//     {
//    	 System.out.println(s);
//     }
     
     // Configuration without xml
     
     @SuppressWarnings("resource")
	ApplicationContext context=new AnnotationConfigApplicationContext(jdbcConfig.class);
     StudentDao studentDao =context.getBean("studentDao",StudentDao.class);
     
		   List<Student> students= studentDao.getAllStudents();
		   for(Student s:students)
		   {
		  	 System.out.println(s);
		   }
     
     
//      
    }
}
