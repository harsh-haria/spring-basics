package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		 foodItem f1 = (foodItem) context.getBean("f1");
		 System.out.println(f1);
		 context.registerShutdownHook();
		 
		 Drink d1 = (Drink) context.getBean("drink1");
		 System.out.println(d1);
		 
		 Topic topic1 = (Topic) context.getBean("topic1");
		 System.out.println(topic1);
	}

}
