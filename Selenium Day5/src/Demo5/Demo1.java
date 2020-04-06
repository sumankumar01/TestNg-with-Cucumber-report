package Demo5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
	
	@Test
	  public void login2() 
		{
	     System.setProperty("webdriver.chrome.driver", "C://Training material//chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://mvnrepository.com/artifact/org.testng/testng/6.14.3");
			driver.quit();
	    }

}
