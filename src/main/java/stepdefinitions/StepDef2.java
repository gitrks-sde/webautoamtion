package stepdefinitions;

import io.cucumber.java.en.Then;

public class StepDef2 {
	@Then("verify Homepage loaded")
	public void verify_homepage_loaded() {
	    System.out.println("Homepage");
	}
}
