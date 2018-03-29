package stepDefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	
	@Before("@MobileTest")
	public void beforevalidation()
	{
		System.out.println("Testing Hooks before");
	}
	
	@After("@MobileTest")
	public void Afterevalidation()
	{
		System.out.println("Testing Hooks After");
	}
	
}
