package Demo5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Demo2 {
	
	@Test
	  public void login3() 
		{
			System.setProperty("webdriver.ie.driver", "C://Training material//IEDriverServer.exe");
			WebDriver driver=new InternetExplorerDriver();
			driver.get("https://mvnrepository.com/artifact/org.testng/testng/6.14.3");
			driver.quit();
	    }

}
