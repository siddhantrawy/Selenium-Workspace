package selenium_features;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    System.out.println("I want to write a step with precondition");
	}
	@Given("some other precondition")
	public void some_other_precondition() {
		System.out.println("some other precondition");
	}
	@When("I complete action")
	public void i_complete_action() {
		System.out.println("I complete action");
	}
	@When("some other action")
	public void some_other_action() {
		System.out.println("some other action");
	}
	@When("yet another action")
	public void yet_another_action() {
		System.out.println("yet another action");
	}
	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("I validate the outcomes");
	}
	@Then("check more outcomes")
	public void check_more_outcomes() {
		System.out.println("check more outcomes");
	}

}
