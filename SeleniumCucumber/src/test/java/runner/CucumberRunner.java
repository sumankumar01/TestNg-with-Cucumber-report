package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\features\\",
		// features = "@target/rerun.txt",
		tags = { "@loginFlight" }, 
		glue = { "stepDefination", "Hooks" },
		//dryRun=true,
		monochrome = true,
		plugin = { "pretty", "json:target/cucumberJsonReport/cucumber.json","html:target/cucumberDefault-reports","junit:target/cucumberJunit-reports/Cucumber.xml" }
// plugin = { "html:target/cucumber-reports"}
// plugin = { "pretty","junit:target/cucumber-reports/Cucumber.xml"}

)

public class CucumberRunner {
	
	//Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));

	
	
}
