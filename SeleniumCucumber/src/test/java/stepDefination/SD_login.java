package stepDefination;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.login;
import seleniumUtility.Root;

public class SD_login extends Root {

	
	
	@Given("^i am on login page$")
	public void i_am_on_login_page() throws Throwable 
	{
		
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
	}

	@When("^i am entering the login credential \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_am_entering_the_login_credential_something_and_something(String username, String password) throws Throwable
	{
		
		System.out.println(username + " " + password);
		login lgn=new login();
		lgn.loginpage(username,password);
		
	}

	@Then("^i am validating the home page$")
	public void i_am_validating_the_home_page() throws Throwable 
	{
		login lgn=new login();
		lgn.homePage();
	}

}
