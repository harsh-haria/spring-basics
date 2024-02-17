package com.springcore.auto.write.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	//if we use @Autowired here, it works the same as autowiring using byName
	@Autowired
	@Qualifier("address1") //this helps us to choose bean of many beans to be used for autowiring
	private Address address;

	public Address getAddress() {
		return address;
	}

	//if we use @Autowired here, it works the same as autowiring using byType
	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	//if we use @Autowired here, it works the same as autowiring using Constructor
	public Emp(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	
	
	
}
