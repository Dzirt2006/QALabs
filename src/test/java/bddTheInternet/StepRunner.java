package bddTheInternet;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/bddTheInternet/scenario", // the path of the feature files
		glue = { "stepDefenitions" }, // the path of the step definition files 
		plugin = { "pretty:target/cucumber-pretty.txt", "html:target/cucumber-html-report", "json:target/cucumber.json",
				"rerun:target/rerun.txt" }, // to generate different types of reporting
		monochrome = true, // display the console output in a proper readable format
		dryRun = false // to check the mapping is proper between feature file and step definition file
)

public class StepRunner 
extends AbstractTestNGCucumberTests {

	@DataProvider(parallel = true)
	@Override
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
