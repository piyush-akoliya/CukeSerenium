package org.automation.ui.CucumberSeleniumSerenity.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.automation.ui.CucumberSeleniumSerenity.steps.serenity.EndUserSteps;
import org.springframework.beans.factory.annotation.Autowired;

public class HamburgerMenuAvailability {

	@Autowired
	EndUserSteps endUserSteps;
	
    @Given("User navigates to the Ace Online Shoe Portal page")
    public void loadingShoeWebsite() {
    	endUserSteps.loadingShoeWebsite();
    }

    @When("the title of the page should be {String}")
    public void checkHomePageTitle(String homePageTitle) {
    	endUserSteps.checkHomePageTitle(homePageTitle);
    }

    @Then("the test {String} is displayed")
    public void displayHamburgerOptions(String displayText) {
    	
    }

}
