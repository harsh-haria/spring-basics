package com.springcore.ci;

public class Person {
	private String personName;
	private int personId;
	private Certi cert;
	
	public Person (String personName,int personId, Certi certi) {
		this.personName = personName;
		this.personId = personId;
		this.cert = certi;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.personName + " : " + this.personId + " : " + this.cert.name;
	}
	
}
