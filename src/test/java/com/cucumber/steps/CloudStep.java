package com.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.common.pages.CloudPage;
import framework.common.pages.HomePage;
import framework.common.pages.InboxPage;
import framework.core.driver.Driver;
import framework.core.util.Waiting;
import org.junit.AfterClass;
import org.testng.Assert;

public class CloudStep {
    private InboxPage inbox;
    private HomePage homePage;
    private CloudPage cloudPage;

    @Given("^a button 'Облако'$")
    public void waitForButtonIsEnabled(){
        Waiting.waitForElementVisibleEnabled(inbox.getCloudButton());
    }

    @When("^click the button$")
    public void openCloudPage() {
        cloudPage = inbox.openCloudPage();
    }

    @Then("^reach to cloud page with a title \"(.*)\"$")
    public void assertTitle(String title){
        Assert.assertEquals(cloudPage.getTitle(), title);
    }

    @AfterClass
    public void closeBrowser(){
        Driver.getWebDriverInstance().quit();
    }
}
