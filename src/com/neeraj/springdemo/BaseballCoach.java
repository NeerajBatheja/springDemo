package com.neeraj.springdemo;

public class BaseballCoach implements Coach {

	//define private field for the dependency
	private FortuneService fortuneservice;
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneservice = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "spend 30 mintutes on batting";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneservice.getFortune();
	}
	
}
