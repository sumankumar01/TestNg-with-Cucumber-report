package Demo4;

import org.testng.annotations.Test;

public class NewTest {
  
	
	@Test(threadPoolSize = 3, invocationCount = 6, timeOut = 1000)
  public void f()
	{
		System.out.println("");
    }
}
