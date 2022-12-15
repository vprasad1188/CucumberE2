package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "E:\\Eclipse\\CucumberE2\\src\\test\\resources\\Features\\google.feature"
		,glue={"stepDefs"},
		dryRun = false,  // to check all step defs are defined and not run steps give dry run as true
		monochrome = true,
		plugin = {"pretty","usage:target/reports/usageReport"
			//	,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				,"rerun:target/failed_scenarios.txt"
				}
		
		)

public class GoogleRunner extends AbstractTestNGCucumberTests {

}
