package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;


@cucumber.api.CucumberOptions(
       features = "src\\test\\resources\\features\\",
        		//features = "@target/rerun.txt",
        tags = {"@Registration"},
        glue={"stepDefination","Hooks"},
    // dryRun=true,
        monochrome = true ,
        plugin = { "pretty","json:target/cucumber1.json", "html:target/cucumber-reports","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports_extent/extentreport.html"}
       // plugin = { "html:target/cucumber-reports"}
       // plugin = { "pretty","junit:target/cucumber-reports/Cucumber.xml"}
      
		)

public class CucumberRunnerTestng extends AbstractTestNGCucumberTests {
	
	/*private TestNGCucumberRunner testRunner;
	
	@BeforeClass
	public void setUP()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		testRunner = new TestNGCucumberRunner(CucumberRunnerTestng.class);
		
	}
	
	
	@Test(description="login",dataProvider="features")
	public void login(CucumberFeatureWrapper  cFeature)
	{
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
	}*/

}
