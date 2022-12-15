package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "E:\\Eclipse\\CucumberE2\\src\\test\\resources\\Features\\login.feature"
		,glue={"stepDefs"}
		,monochrome = true
		
		)

public class loginRunner extends AbstractTestNGCucumberTests {

}
