package com.springcore.annotationconfig;

import org.springframework.stereotype.Component;

@Component
public class Student {
	public void study() {
		System.out.println("student is reading");
	}
}
