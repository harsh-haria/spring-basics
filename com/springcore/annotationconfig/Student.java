package com.springcore.annotationconfig;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private Teacher teacher;
	
	public Student(Teacher teacher) {
		super();
		this.teacher = teacher;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void study() {
		teacher.teach();
		System.out.println("student is reading");
	}
}
