package com.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.common.bo.User;
import framework.common.pages.CloudPage;
import framework.common.pages.HomePage;
import framework.common.pages.InboxPage;
import framework.core.util.Waiting;
import org.testng.Assert;

public class LoginStep {
    private InboxPage inbox;
    private HomePage homePage;
    private CloudPage cloudPage;
    private User user = new User();

    @Given("^an open browser with mail.ru$")
    public void open(){
        homePage = new HomePage();
        homePage.open();
    }

    @When("^fill username \"(.*)\" and password \"(.*)\"$")
    public void fillInput(String username, String pass){
        user.setUsername(username);
        user.setPassword(pass);
        homePage.fillUsername(username).fillPassword(pass);
    }

    @Then("^click and reach to the inbox page$")
    public void signIn() {
        inbox = homePage.signIn();
        Assert.assertTrue(inbox.getUserName().equals(user.getUsername()));
    }


}
