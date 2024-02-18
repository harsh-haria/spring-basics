package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("student")
@Scope("prototype") //this is for the bean lifecycle.
public class Student {
	@Value("Harsh")
	private String studentName;
	@Value("Mumbai")
	private String studentCity;
	
	@Value("#{favCities}")
	private List<String> cities;
	
	public List<String> getCities() {
		return cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}
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
