package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context= new ClassPathXmlApplicationContext("conf.xml");
		
		Mobile mobile=(Mobile)context.getBean("mobile");
		mobile.display();
	}
}
