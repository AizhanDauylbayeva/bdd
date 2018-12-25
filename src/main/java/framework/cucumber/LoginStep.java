package framework.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.common.pages.HomePage;
import framework.common.pages.InboxPage;
import org.testng.Assert;

public class LoginStep {
    private InboxPage inbox;
    private HomePage homePage;
    private String username;

    @Given("Given an open browser with mail.ru")
    public void open(){
        homePage = new HomePage();
        homePage.open();
    }

    @When("fill username as (.*) and password as (.*)")
    public void fillInput(String username, String pass){
        this.username = username;
        homePage.fillUsername(username).fillPassword(pass);
    }

    @Then("click and we reach the inbox page")
    public void signIn() {
        inbox = homePage.signIn();
        Assert.assertTrue(inbox.getUserName().equals(this.username));
    }
}
