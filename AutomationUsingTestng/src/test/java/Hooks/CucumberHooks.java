package Hooks;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CucumberHooks {
	
	@Before
	public void browserSetup(Scenario sceanario)
	{
		System.out.println("Before cucumber step");
	}
	
	@After
	public void result(Scenario sceanario)
	{
		System.out.println("After cucumber step");
	}

}
