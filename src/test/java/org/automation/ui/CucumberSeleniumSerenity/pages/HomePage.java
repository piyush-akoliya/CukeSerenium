package org.automation.ui.CucumberSeleniumSerenity.pages;

import org.automation.ui.CucumberSeleniumSerenity.steps.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    
    private SeleniumUtils seleniumUtils;
    
    // Locators
    private By shoePortalTitle = seleniumUtils.byId("ShoePortalTitle");
    private By mainPageText = seleniumUtils.byId("MainPageText");
    private By copyrightFooter = seleniumUtils.byId("CopyrightFooter");

    public HomePage(WebDriver driver) {
        this.seleniumUtils= new SeleniumUtils("chrome");
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
