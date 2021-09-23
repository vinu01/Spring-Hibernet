package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// Load the spring configuration file
		
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		// Retrieve the bean form spring container
		
		Coach theCoach=context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach=context.getBean("myCoach", Coach.class);
		
		// check if they are the same
		
		boolean result = (theCoach==alphaCoach);
		
		
		
		
		// Call methods
		
		System.out.println("\nPointing to the same object: "+ result);
		System.out.println("\nmemory location for theCoach: " + theCoach);
		System.out.println("\nMemory loaction for alphaCoach: "+ alphaCoach);
		
		// Close the context
		
		context.close();

	}

}
