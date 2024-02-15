package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Topic {
	private String example;

	public String getExample() {
		return example;
	}

	public void setExample(String example) {
		this.example = example;
	}

	@Override
	public String toString() {
		return "Topic [example=" + example + "]";
	}

	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@PostConstruct
	public void init() {
		System.out.println("Inside of implementation of anotaions - init");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Inside of implementation of anotaions - destroy");
	}
}
