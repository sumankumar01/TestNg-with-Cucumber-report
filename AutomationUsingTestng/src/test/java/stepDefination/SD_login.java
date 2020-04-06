package stepDefination;



import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SD_login {
	
	   @Given("^i am on login page$")
	    public void i_am_on_login_page() throws Throwable {
	       
		   long id = Thread.currentThread().getId();
		      System.out.println(new Object(){}.getClass().getEnclosingMethod().getName()+" -> Thread id is: " + id);
			 // System.out.println();
	    }
	   
	  /* @When("i am entering the login credential {string} and {string}")
	   public void i_am_entering_the_login_credential_and(String Username, String Password) {
	       // Write code here that turns the phrase above into concrete actions
	       
	   }
	   */
	   @When("^i am entering the login credential \"([^\"]*)\" and \"([^\"]*)\" $")
	    public void i_am_entering_the_login_credential_something_and_something(String username, String password) throws Throwable {
	       
	    }

	    @When("^i am entering the login credential$")
	    public void i_am_entering_the_login_credential() throws Throwable {
	    	
	    	long id = Thread.currentThread().getId();
		      System.out.println(new Object(){}.getClass().getEnclosingMethod().getName()+" -> Thread id is: " + id);
	      
	    }

	    @Then("^i am validating the home page$")
	    public void i_am_validating_the_home_page() throws Throwable {
	    	
	    	long id = Thread.currentThread().getId();
		      System.out.println(new Object(){}.getClass().getEnclosingMethod().getName()+" -> Thread id is: " + id);
	       
	    }
	
	    @Given("i am on sign on page")
	    public void i_am_on_sign_on_page() {
	        // Write code here that turns the phrase above into concrete actions
	    	long id = Thread.currentThread().getId();
		      System.out.println(new Object(){}.getClass().getEnclosingMethod().getName()+" -> Thread id is: " + id);
	       
	    }

	    @When("i am entering the passager details")
	    public void i_am_entering_the_passager_details() {
	        // Write code here that turns the phrase above into concrete actions
	    	long id = Thread.currentThread().getId();
		      System.out.println(new Object(){}.getClass().getEnclosingMethod().getName()+" -> Thread id is: " + id);
	       
	    }

	  


	    
	    @When("i am entering the Registration details")
	    public void i_am_entering_the_Registration_details(cucumber.api.DataTable dataTable) {
	        // Write code here that turns the phrase above into concrete actions
	        // For automatic transformation, change DataTable to one of
	        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	        // Double, Byte, Short, Long, BigInteger or BigDecimal.
	        //
	        // For other transformations you can register a DataTableType.
	    	//List<List<String>> data = dataTable.raw();
	    	
	    	 List<List<String>> data = dataTable.raw();
	    	System.out.println(data.get(1).get(1));
	    	
	    	System.out.println(data.get(2).get(1));
	    	
	    	System.out.println(data.get(3).get(1));
	    	
	    	System.out.println(data.get(4).get(1));
	    	
	    	System.out.println(data.get(5).get(1));
	    	System.out.println(data.get(6).get(1));
	    	System.out.println(data.get(6).get(2));
	    	System.out.println(data.get(6).get(3));
	    }





}
