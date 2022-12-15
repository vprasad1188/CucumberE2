package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "@target/failed_scenarios.txt"
		,glue={"stepDefs"}
		,monochrome = true
		)

public class RerunRunner extends AbstractTestNGCucumberTests {

}
