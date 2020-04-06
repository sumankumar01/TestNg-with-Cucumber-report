package demo3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	
	
	@BeforeSuite
   public void beforeSuite() 
	  {
		  System.out.println("-------beforeSuite");
	  }
  
	@BeforeClass
	  public void beforeClass() 
	  {
		 System.out.println("--beforeClass");
	  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("-------------BeforeMethod");
  }

 

  
  
  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("----BeforeTest");
  } 
  
  @Test
  public void login() 
	{
	  System.out.println("======login");
    }
  
  @Test
  public void home() 
	{
	  System.out.println("======home");
    }
  
  @AfterTest
  public void afterTest() 
  {
	  System.out.println("=====afterTest");
  }
  
  @AfterClass
  public void afterClass() 
  {
	  System.out.println("==afterClass");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("---AfterMethod"); 
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("=================afterSuite"); 
  }

}
