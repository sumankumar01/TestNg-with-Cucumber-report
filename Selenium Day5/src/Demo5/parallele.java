package Demo5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallele {

	@Test
	  public void login1() 
		{
	     System.setProperty("webdriver.chrome.driver", "C://Training material//chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://mvnrepository.com/artifact/org.testng/testng/6.14.3");
			driver.quit();
	    }
	
	@Test
	  public void login2() 
		{
	     System.setProperty("webdriver.chrome.driver", "C://Training material//chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://mvnrepository.com/artifact/org.testng/testng/6.14.3");
			driver.quit();
	    }
	
	@Test
	  public void login3() 
		{
	     System.setProperty("webdriver.chrome.driver", "C://Training material//chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://mvnrepository.com/artifact/org.testng/testng/6.14.3");
			driver.quit();
	    }
	
	
}
