package com.springcore.auto.write.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	
	//if we use @Autowired here, it works the same as autowiring using byName
//	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

	//if we use @Autowired here, it works the same as autowiring using byType
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	//if we use @Autowired here, it works the same as autowiring using Constructor
	@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	
	
	
}
