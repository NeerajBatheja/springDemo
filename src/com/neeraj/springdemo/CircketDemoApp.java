package com.neeraj.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircketDemoApp {

	public static void main(String arg[]) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach thecoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		
		System.out.println(thecoach.getDailyWorkout());
		System.out.println(thecoach.getDailyFortune());
		System.out.println(thecoach.getEmailAddress());
		System.out.println(thecoach.getTeam());
		
		context.close();
	}
}
