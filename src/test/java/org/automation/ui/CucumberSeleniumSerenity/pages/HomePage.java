package org.automation.ui.CucumberSeleniumSerenity.pages;

import org.automation.ui.CucumberSeleniumSerenity.utils.SeleniumUtils;
import org.openqa.selenium.By;

public class HomePage {

	private SeleniumUtils seleniumUtils;

	// Locators
	private By shoePortalTitle;
	private By mainPageText;
	private By copyrightFooter;

	public HomePage(String url) {
		this.seleniumUtils = new SeleniumUtils(url);
		shoePortalTitle = seleniumUtils.byId("ShoePortalTitle");
		mainPageText = seleniumUtils.byId("MainPageText");
		copyrightFooter = seleniumUtils.byId("CopyrightFooter");
	}

	// Methods to interact with elements
	public String getShoePortalTitle() {
		return seleniumUtils.getText(shoePortalTitle);
	}

	public String getMainPageText() {
		return seleniumUtils.getText(mainPageText);
	}

	public String getCopyrightFooter() {
		return seleniumUtils.getText(copyrightFooter);
	}
}
