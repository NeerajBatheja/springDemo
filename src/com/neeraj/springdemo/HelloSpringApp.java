package com.neeraj.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load srping conf file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		//call methods on bean
		System.out.print(theCoach.getDailyWorkout()+"\n");
		
		System.out.print(theCoach.getDailyFortune());
		
		//close the context
		context.close();
		
		

	}

}
