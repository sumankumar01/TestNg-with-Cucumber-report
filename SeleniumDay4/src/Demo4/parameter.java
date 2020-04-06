package Demo4;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
  
	@Parameters({ "test-two-param" })
	@Test
  public void f(String param) {
		
		  System.out.println("I am login method of Abc class "+param);
  }
}
