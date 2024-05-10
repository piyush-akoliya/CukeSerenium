package org.automation.ui.CucumberSeleniumSerenity.acceptancetests;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/", glue="org.automation.ui.CucumberSeleniumSerenity")
public class AcceptanceTestSuite {}


