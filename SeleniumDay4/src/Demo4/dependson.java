package Demo4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependson {
 
	
	
	@Test
	   public void method1() 
	   {
	      System.out.println("Method 1");
	      // Failing test explicitly
	     Assert.fail();
	     
	   }

	   // alwaysRun attribute will override dependsOnMethods if dependent method is failed or skipped
	   @Test(dependsOnMethods = "method1")
	   public void method2() 
	   {
	      System.out.println("Method 2");
	   }

	   @Test( alwaysRun=true)
	   public void method3() 
	   {
	      System.out.println("Method 3");
	   }
	   // alwaysRun attribute will override dependsOnMethods if dependent method is failed or skipped
	   @Test(dependsOnMethods = "method3", alwaysRun=true)
	   public void method4() 
	   {
	      System.out.println("Method 4");
	   }
	   
	   @Test(enabled=true)
	   public void method5() 
	   {
	      System.out.println("Method5 ");
	   }
	   
	   @Test(groups = { "Regression"})
	   public void method6() 
	   {
	      System.out.println("Method6 group regression ");
	     Assert.fail();
	   }
	   
	   
	   @Test(dependsOnGroups="Regression")
	   public void method7() 
	   {
	      System.out.println("Method7 depends on regression");
	   }
	   
	   
	
}
