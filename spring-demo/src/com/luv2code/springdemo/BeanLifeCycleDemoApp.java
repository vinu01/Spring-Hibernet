package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("BeanLifeCycle-applicationContext.xml");
		

		// Retrieve bean from spring container
		
		Coach theCoach=context.getBean("myCoach",TrackCoach.class);
		
		Coach alphaCoach=context.getBean("myCoach",TrackCoach.class);
		
		boolean result=(theCoach==alphaCoach);
		//output
		System.out.println("\nPointing to the same object: "+ result);
		System.out.println("\nmemory location for theCoach: " + theCoach);
		System.out.println("\nMemory loaction for alphaCoach: "+ alphaCoach);
		System.out.println(theCoach.getDailyWorkout());
		
		//context close
		context.close();
	}

}
