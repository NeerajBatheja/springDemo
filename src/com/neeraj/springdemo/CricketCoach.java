package com.neeraj.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneSerivce;
	
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public CricketCoach()
	{
		System.out.print("cricket coach inside no-arg constructor\n");
	}
	
	//setter method for setter injection
	public void setFortuneSerivce(FortuneService fortuneSerivce) {
		System.out.print("cricket coach inside setter method - setFortuneSerivce");
		this.fortuneSerivce = fortuneSerivce;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice fast bowling";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneSerivce.getFortune();
	}

}
