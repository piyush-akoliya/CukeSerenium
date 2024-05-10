package org.automation.ui.CucumberSeleniumSerenity.driver;

import java.net.MalformedURLException;
import java.net.URI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import net.thucydides.core.webdriver.DriverSource;

public class CustomDriver implements DriverSource {
	@Override
	public WebDriver newDriver() {
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setBrowserName("chrome");
		capabilities.setVersion("80.0");

		capabilities.setCapability("enableVNC", true);
		capabilities.setCapability("enableVideo", false);

		RemoteWebDriver driver = null;
		try {
			driver = new RemoteWebDriver(URI.create("https://anupdamoda.github.io/AceOnlineShoePortal/index.html").toURL(), capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return driver;
	}

	@Override
	public boolean takesScreenshots() {
		return false;
	}
}