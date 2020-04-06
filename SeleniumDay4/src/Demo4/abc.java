package Demo4;

import org.testng.annotations.Test;

public class abc {
	
	
  @Test
  public void login() 
  {
	  
	  long id = Thread.currentThread().getId();
      System.out.println("Thread id is: " + id);
	  System.out.println("I am login method of Abc class");
  }
  
  @Test
  public void home() 
  {
	  
	  long id = Thread.currentThread().getId();
      System.out.println("Thread id is: " + id);
	  System.out.println("I am home method of Abc class");
  }
  
  
  @Test
  public void payment() 
  {
	  
	  long id = Thread.currentThread().getId();
      System.out.println("Thread id is: " + id);
	  System.out.println("I am payment method of Abc class");
  }
}
