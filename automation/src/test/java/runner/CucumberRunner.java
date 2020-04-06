package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//@CucmberOptions() annotation is used to set some properties for our cucumber test like feature file, step definition, etc.

@RunWith(Cucumber.class)
@CucumberOptions(
       features = "src\\test\\resources\\features\\",
        		//features = "@target/rerun.txt",
        tags = {"@Registration"},
      glue={"stepDefination","Hooks"},
       //dryRun=true,
       monochrome = true ,
     plugin = { "pretty","json:target/cucumber.json"}
       //plugin = { "html:target/cucumber-reports"}
       // plugin = { "pretty","junit:target/cucumber-reports/Cucumber.xml"}
      
		)

public class CucumberRunner {
	
	
	

	
	

}
