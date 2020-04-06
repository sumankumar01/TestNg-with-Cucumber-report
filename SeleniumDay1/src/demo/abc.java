package demo;

import org.testng.annotations.Test;

public class abc {
	
	@Test(groups = { "Regression"})
	public void login()
	{
		System.out.println("i am login method");
	}
	
	@Test(groups = { "Regression"})
	public void HomePage()
	{
		System.out.println("i am home method");
	}
	@Test(groups = { "Sanity"})
	public void paymentpage()
	{
		System.out.println("i am paymentpage method");
	}
}
