package org.automation.ui.CucumberSeleniumSerenity.steps.serenity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.automation.ui.CucumberSeleniumSerenity.pages.HomePage;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Step;

@RunWith(SerenityRunner.class)
public class EndUserSteps {

	HomePage homePage = new HomePage("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");

	public EndUserSteps() {
	}

	@Step
	public void loadingShoeWebsite() {
		System.out.println("The page loaded ya'll");
		System.out.println(homePage.getMainPageText());
		System.out.println(homePage.getShoePortalTitle());
		if (homePage.getShoePortalTitle() != null)
			assertTrue(true);
		else
			assertTrue(false);
	}

	@Step
	public void checkHomePageTitle() {
	    assertEquals("Ace Online Shoe Portal", homePage.getShoePortalTitle());
	}


}
