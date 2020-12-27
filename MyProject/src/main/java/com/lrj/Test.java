package com.lrj;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac =  new AnnotationConfigApplicationContext(AppConfig.class);
		AppConfig testService = ac.getBean(AppConfig.class);
		System.out.println(testService);
	}
}
