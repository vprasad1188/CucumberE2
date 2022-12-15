package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DealStepDef {
	
	// These are the hooks in cucumber  @Before  @BeforeAll  @BeforeStep
	//@After
	
	@BeforeAll
	public static void beforeAllScenarios(){
		System.out.println("Once before all scenarios---------");
	}
	
	@AfterAll
	public static void afterAllScenarios(){
		System.out.println("Once After all scenarios---------");
	}
	
	@Before
	public void beforeEachScenarios(){
		System.out.println("Before each Scenario-------");
	}
	
	@Before("@SmokeTest or @RegressionTest")
	public void beforeSmokeTestScenarios(){
		System.out.println("Before SmokeTest Scenario-------");
	}
	
	@After
	public void afterEachScenarios(){
		System.out.println("After each Scenario-------");
	}
	
	@BeforeStep
	public void beforeEachStep(){
		System.out.println("Before each Step-------");
	}
	
	@Given("User is logged in")
	public void user_is_logged_in() {
		System.out.println("User is logged in");	  	    
	}
	
	@When("User create a new deal")
	public void user_create_a_new_deal() {	    
	    System.out.println("User create a new deal");
	}
	
	@When("User view deal details")
	public void user_view_deal_details() {
		System.out.println("User view deal details");   	    
	}
	
	@When("User update deal details")
	public void user_update_deal_details() {
		System.out.println("User update deal details");   	    
	}
	
	@When("User delete a deal")
	public void user_delete_a_deal() {
		System.out.println("User delete a deal");  	    
	}
	
	@When("User create a new Task")
	public void user_create_a_new_task() {
	    
	    System.out.println("User create a new Task");
	}

	
	@When("User view Task details")
	public void user_view_task_details() {
	    
	    System.out.println("User view Task details");
	}
	

	
	
	
	
	
	

}
