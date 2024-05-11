package org.automation.ui.CucumberSeleniumSerenity.steps;

import org.automation.ui.CucumberSeleniumSerenity.steps.serenity.EndUserSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class HamburgerMenuAvailability {

	EndUserSteps endUserSteps=new EndUserSteps();
	

	@Given("User navigates to the Ace Online Shoe Portal page")
    public void loadingShoeWebsite() {
    	endUserSteps.loadingShoeWebsite();
    }

	@When("the title of the page should be correct")
	public void the_title_of_the_page_should_be_correct() {
		endUserSteps.checkHomePageTitle();
	}

}
