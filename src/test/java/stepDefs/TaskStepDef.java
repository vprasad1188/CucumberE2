package stepDefs;

import io.cucumber.java.en.When;

public class TaskStepDef {
	
	@When("User update Task details")
	public void user_update_task_details() {
	    System.out.println("User update Task details");
	    
	}
	
	@When("User delete a Task")
	public void user_delete_a_task() {
	    
	    System.out.println("User delete a Task");
	}

}
