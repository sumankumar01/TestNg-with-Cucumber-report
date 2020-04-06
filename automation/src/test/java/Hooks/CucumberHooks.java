package Hooks;



import io.cucumber.core.gherkin.Step;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class CucumberHooks{
	
	
	
	@Before(order=1)
	public void browserSetuporder(Scenario sceanario)
	{
		System.out.println("Before cucumber Scanario order" );
		
		
		
		
	}
	
	
	@Before
	public void browserSetup(Scenario sceanario)
	{
		System.out.println("Before cucumber Scanario");
		
		
		
		
	}
	
	@After
	public void AfterScanario(Scenario sceanario)
	{
		System.out.println("After cucumber Scanario");
		System.out.println(sceanario.getName());
		
		//scenario.getName()
		
		
		
		if(sceanario.isFailed())
		{
			System.out.println("Failed");
		}
		else
		{
			System.out.println("Passed");
		}
		
		
	}
	
	
	@AfterStep
	public void AfterStep(Scenario step)
	{
		System.out.println("After cucumber step");
		
		
		
		
	}
	@BeforeStep
	public void BeforeStep(Scenario step)
	{
		
		System.out.println("Before cucumber step");
		
		
	}
	

}
