package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
		SpelDemo d1 = context.getBean("spelDemo", SpelDemo.class);
		System.out.println(d1);
		
		
		SpelExpressionParser spel = new SpelExpressionParser();
		Expression exp = spel.parseExpression("44+10-5");
		System.out.println(exp.getValue());
	}
}
