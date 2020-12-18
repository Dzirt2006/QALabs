package bddTheInternet;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/*
 * Run this class as JUnit
 */



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/bddTheInternet/scenario", // the path of the feature files
		glue = { "stepDefenitions" } // the path of the step definition files
)
public class StepRunner{}
//public class StepRunner extends AbstractTestNGCucumberTests {
//
//	@DataProvider(parallel = true)
//	@Override
//	public Object[][] scenarios() {
//		return super.scenarios();
//	}
//}
