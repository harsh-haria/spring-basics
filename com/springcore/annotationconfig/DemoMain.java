package com.springcore.annotationconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
		Student student = context.getBean("getStudent", Student.class);
		System.out.println(student);
		student.study();
	}

}
