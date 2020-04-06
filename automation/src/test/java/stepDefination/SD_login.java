package stepDefination;

import java.util.List;

import org.junit.Assert;

import io.cucumber.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_login {
	
	   @Given("^i am on login page$")
	    public void i_am_on_login_page() throws Throwable {
		   
		   
	       
	    }
	   
	   
	
	  /*@When("i am entering the login credential {string} and {string}") public void
	  i_am_entering_the_login_credential_and(String string, String string2) {
	  
		  
		  System.out.println(string+" "+string2);
	  }*/
	 
	   
	   @When("^i am entering the login credential \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void i_am_entering_the_login_credential_something_and_something(String username, String password) throws Throwable {
		  
		   System.out.println(username+" "+password);
		   
		   
		   
	    }


	    @When("^i am entering the login credential$")
	    public void i_am_entering_the_login_credential() throws Throwable {
	    	
	    	
	      
	    }

	    @Then("^i am validating the home page$")
	    public void i_am_validating_the_home_page() throws Throwable {
	       
	    	
	    	
	    }
	
	    @Given("i am on sign on page")
	    public void i_am_on_sign_on_page() {
	        // Write code here that turns the phrase above into concrete actions
	        
	    }

	    @When("i am entering the passager details")
	    public void i_am_entering_the_passager_details() {
	        // Write code here that turns the phrase above into concrete actions
	       
	    }

	    @Then("i am validating the registered passanger")
	    public void i_am_validating_the_registered_passanger() {
	        
	    }
	    
	    @When("i am entering the Registration details")
	    public void i_am_entering_the_Registration_details(DataTable dataTable) {
	        // Write code here that turns the phrase above into concrete actions
	        // For automatic transformation, change DataTable to one of
	        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	        // Double, Byte, Short, Long, BigInteger or BigDecimal.
	        //
	        // For other transformations you can register a DataTableType.
	    	//List<List<String>> data = dataTable.raw();
	    	
	    	System.out.println(dataTable.height()+"->"+dataTable.width());
	    	
	    	for(int i=0;i<dataTable.height();i++)
	    	{
	    		for(int k=0;k<dataTable.width();k++)
	    		{
	    			System.out.println(dataTable.cell(i, k));
	    		}
	    	}
	    	
	    	/*System.out.println(dataTable.cell(1, 1));
	    	
	    	System.out.println(dataTable.cell(2, 1));
	    	
	    	System.out.println(dataTable.cell(3, 1));
	    	
	    	System.out.println(dataTable.cell(4, 1));
	    	
	    	System.out.println(dataTable.cell(5,1));
	    	System.out.println(dataTable.cell(6,1));
	    	System.out.println(dataTable.cell(6,2));
	    	System.out.println(dataTable.cell(6,3));*/
	    }



}
