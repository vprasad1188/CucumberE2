package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "E:\\Eclipse\\CucumberE2\\src\\test\\resources\\Features\\logindatatable.feature"
		,glue={"stepDefs"}
		,monochrome = true
		
		)

public class logindatatableRunner extends AbstractTestNGCucumberTests {

}
