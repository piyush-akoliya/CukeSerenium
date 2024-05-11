package org.automation.ui.CucumberSeleniumSerenity.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.thucydides.core.webdriver.DriverSource;

public class CustomDriver implements DriverSource {
	@Override
	public WebDriver newDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/piyushakoliya/docker-microservice-workspace/chromedriver-mac-arm64/chromedriver");

        // Configure Chrome options
        ChromeOptions options = new ChromeOptions();
        // Add any additional Chrome options if needed

        // Initialize Chrome driver
        WebDriver driver = new ChromeDriver(options);

        return driver;
	}

	@Override
	public boolean takesScreenshots() {
		return false;
	}
}