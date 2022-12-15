package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "E:\\Eclipse\\CucumberE2\\src\\test\\resources\\taggedFeatures\\"
		,glue={"stepDefs"}
		,monochrome = true
		,dryRun = false
		,plugin = {"html:target/reports/htmlcrm.html"}
		//,tags = "@SmokeTest or @RegressionTest"
		//,tags = "not @SmokeTest"
		//,tags = "@SmokeTest and @RegressionTest"
		//,tags = "@PhaseOne"
		
		)

public class DealRunner extends AbstractTestNGCucumberTests {

}
