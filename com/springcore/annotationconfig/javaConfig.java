package com.springcore.annotationconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaConfig {
	
	@Bean
	public Teacher getTeacherStatus() {
		return new Teacher();
	}
	
	@Bean
	public Student getStudent() {
		Student student = new Student(getTeacherStatus());
		return student;
	}
}
