package Demo5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class NewTest {
  
	@Test
  public void login1() 
	{
		System.setProperty("webdriver.chrome.driver", "C://Training material//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/org.testng/testng/6.14.3");
		driver.quit();
    }
	

	
	
	

	
	
	

	
	

	
}
