package Hooks;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import seleniumUtility.Root;
import seleniumUtility.listiner;

public class CucumberHooks extends Root {
	
	
	
	@Before
	public void browserSetup(Scenario sceanario)
	{
		System.out.println("Before cucumber Scanario");
		
		System.setProperty("webdriver.chrome.driver", "C://Training material//chromedriver.exe");
		
		/* EventFiringWebDriver driver = new EventFiringWebDriver(driver1); 
		  listiner eCapture = new listiner(); 
		driver.register(eCapture);*/
		driver=new ChromeDriver();
		
		
		  

		
		
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
		
		driver.quit();
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
