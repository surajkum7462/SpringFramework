package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Anno_tation {
	
	private String subject;

	@Override
	public String toString() {
		return "Anno_tation [subject=" + subject + "]";
	}

	public Anno_tation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@PostConstruct
	public void start()
	{
		System.out.println("starting method");
	}
	
	
	@PreDestroy
	public void end()
	{
		System.out.println("ending method");
	}
}
