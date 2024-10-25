package com.springcore.javaconfig;

//import org.springframework.stereotype.Component;


public class Student {
	
	
	private Dependency depend;
	
	public Student(Dependency depend) {
		super();
		this.depend = depend;
	}

	public Dependency getDepend() {
		return depend;
	}

	public void setDepend(Dependency depend) {
		this.depend = depend;
	}

	public void study()
	{
		this.depend.display();
		System.out.println("Student is reading");
	}

}
