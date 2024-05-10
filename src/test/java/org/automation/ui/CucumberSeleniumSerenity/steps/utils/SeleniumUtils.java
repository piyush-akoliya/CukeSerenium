package org.automation.ui.CucumberSeleniumSerenity.steps.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import net.thucydides.core.annotations.Managed;

public class SeleniumUtils {

	@Managed
    private WebDriver driver;
    
    private final String CHROME="chrome";
    private final String SAFARI="safari";
    
    public SeleniumUtils(String driver) {
        if(driver.equalsIgnoreCase(CHROME))
        	this.driver = new ChromeDriver();
        else if(driver.equalsIgnoreCase(SAFARI))
        	this.driver = new SafariDriver();
    }

    // Method to click on a web element
    public void clickElement(By locator) {
        findElement(locator).click();
    }

    // Method to enter text into a text field
    public void enterText(By locator, String text) {
        WebElement element = findElement(locator);
        element.clear();
        element.sendKeys(text);
    }

    // Method to get text from a web element
    public String getText(By locator) {
        return findElement(locator).getText();
    }

    // Method to check if a web element is displayed
    public boolean isElementDisplayed(By locator) {
        return findElement(locator).isDisplayed();
    }

    // Method to find a web element
    private WebElement findElement(By locator) {
        return driver.findElement(locator);
    }
    
    // Method to create and return By object using ID locator
    public By byId(String id) {
        return By.id(id);
    }

    // Method to create and return By object using name locator
    public By byName(String name) {
        return By.name(name);
    }

    // Method to create and return By object using XPath locator
    public By byXPath(String xpath) {
        return By.xpath(xpath);
    }

    // Method to create and return By object using CSS selector locator
    public By byCssSelector(String cssSelector) {
        return By.cssSelector(cssSelector);
    }

    // Method to create and return By object using link text locator
    public By byLinkText(String linkText) {
        return By.linkText(linkText);
    }

    // Method to create and return By object using partial link text locator
    public By byPartialLinkText(String partialLinkText) {
        return By.partialLinkText(partialLinkText);
    }
}
