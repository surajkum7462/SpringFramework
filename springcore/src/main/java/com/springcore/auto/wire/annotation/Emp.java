package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired 
	@Qualifier("temp2")
	
	// we have to config in xml file
	private Address address;

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

//	we can also write @Autowired  here
	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp() {
		super();
		
	}

//	we can also write @Autowired  here
	public Emp(Address address) {
		super();
		this.address = address;
	}

}
