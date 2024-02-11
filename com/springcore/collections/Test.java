package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Printing from test.java in collections");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collection-config.xml");
		Emp emp1 = (Emp) context.getBean("emp1");
		System.out.println(emp1);
	}
}
