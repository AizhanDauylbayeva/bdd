package tests;

import cucumber.api.java.en.Given;
import framework.common.pages.HomePage;
import framework.common.pages.InboxPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import framework.common.pages.CloudPage;

public class CloudTest {

    private CloudPage cloudPage;
/*    private HomePage homePage;

    @Given("Given an open browser with mail.ru")
            homePage = new HomePage();
    InboxPage inbox = homePage.open();*/

    @Test(description = "Login test")
    public void loginTest() {
        Assert.assertTrue(isUserSignedIn(), "Authentication failed");
    }

    @Test(dependsOnMethods = "loginTest")
    public void openCloudPage() {
        cloudPage = inbox.openCloudPage();
        Assert.assertEquals(cloudPage.getTitle(), "Облако Mail.Ru");
    }

    @Test(dependsOnMethods = "openCloudPage")
    public void createFolder(){
        cloudPage.closePanel();
        cloudPage.createFolder();
        cloudPage.refresh();
        Assert.assertTrue(cloudPage.isFolderExist(), "The folder doesn't created");
    }

    @Test(dependsOnMethods = "createFolder")
    public void removeTheFolder() {
        cloudPage.removeTheNewFolder();
        Assert.assertFalse(cloudPage.isFolderExist(), "The folder doesn't removed");
    }
}
