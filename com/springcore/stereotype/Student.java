package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	@Value("Harsh")
	private String studentName;
	@Value("Mumbai")
	private String studentCity;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentCity=" + studentCity + "]";
	}
	public Student(String studentName, String studentCity) {
		super();
		this.studentName = studentName;
		this.studentCity = studentCity;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
