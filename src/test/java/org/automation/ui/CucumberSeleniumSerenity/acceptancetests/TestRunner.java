package org.automation.ui.CucumberSeleniumSerenity.acceptancetests;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/", glue = "org.automation.ui.CucumberSeleniumSerenity.steps",monochrome = false,dryRun = false)
public class TestRunner{
}
