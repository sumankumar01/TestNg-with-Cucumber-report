package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
 
	
  @Test
  public void login()
	{
    
		System.out.println("I am a login method");
		Assert.assertEquals(5, 2);
	}
}
