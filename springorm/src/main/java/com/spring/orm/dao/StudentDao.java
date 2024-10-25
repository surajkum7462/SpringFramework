package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;



@Transactional
public class StudentDao {
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	private HibernateTemplate hibernateTemplate;
	
	
	public int insert(Student st)
	{
		//insert
		
		int i=(Integer)this.hibernateTemplate.save(st);
		return i;
	}
	
	// get the single data object
	public Student getStudent(int studentId)
	{
		Student student=this.hibernateTemplate.get(Student.class,studentId);
		return student;
	}
	
	//get all student(object)
	public List<Student> getAllStudents()
	{
		List<Student> student=this.hibernateTemplate.loadAll(Student.class);
		return student;
	}
	
	// delete operation
	@Transactional
	public void delete(int studentId)
	{
		Student student=this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
		System.out.println("Deleted Successfully of Id:"+studentId);
	}
	
	
	//updating data.....
	
	@Transactional
	public void updateStudent(Student student)
	{
		this.hibernateTemplate.update(student);
		System.out.println("Updation Successfully");
	}

	 
}
