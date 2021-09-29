package com.neeraj.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneservice;
	
	private TrackCoach(FortuneService theFortuneService) {
		fortuneservice = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}
	
	//add an init method
	public void startUp()
	{
		System.out.println("TrackCoach: inside method Startup");
	}
	
	//add a destory method

	public void destroyDown()
	{
		System.out.println("TrackCoach: inside method DestroyDown");
	}
}
