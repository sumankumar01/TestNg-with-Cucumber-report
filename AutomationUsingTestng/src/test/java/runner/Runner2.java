package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@cucumber.api.CucumberOptions(
	       features = "src\\test\\resources\\features\\login2.feature",
	        		//features = "@target/rerun.txt",
	       // tags = {"@loginmain"},
	        glue={"stepDefination","Hooks"},
	    // dryRun=true,
	        monochrome = true ,
	        plugin = { "pretty","json:target/cucumber2.json"}
	        //plugin = { "html:target/cucumber-reports"}
	       // plugin = { "pretty","junit:target/cucumber-reports/Cucumber.xml"}
	      
			)
public class Runner2 {
	

	
	private TestNGCucumberRunner testRunner;//=new TestNGCucumberRunner(CucumberRunnerTestng.class);;
	
	@BeforeClass
	public void setUP()
	{
	/*	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();*/
		testRunner = new TestNGCucumberRunner(this.getClass());
		
	}
	
	
	@Test(description="login",dataProvider="features")
	public void login(CucumberFeatureWrapper cFeature)
	{
		//testRunner = new TestNGCucumberRunner(CucumberRunnerTestng.class);
		testRunner.runCucumber(cFeature.getCucumberFeature());
	}
	@DataProvider(name="features")
	public Object[][] getFeatures()
	{
		return testRunner.provideFeatures();
	}
	@AfterClass
	public void tearDown()
	{
		testRunner.finish();
	}



}
