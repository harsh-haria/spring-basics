package com.springcore.annotationconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaConfig {
	
	@Bean
	public Student getStudent() {
		Student student = new Student();
		return student;
	}
}
