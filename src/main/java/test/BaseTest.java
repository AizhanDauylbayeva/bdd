package test;

import framework.common.bo.User;
import framework.common.pages.HomePage;
import framework.common.pages.InboxPage;
import framework.core.driver.Driver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected InboxPage inbox;
    protected User user = new User("new_account_2018@bk.ru", "password2018");

    @BeforeClass
    public void login() {
        inbox = new HomePage().open().fillUsername(user.getUsername()).fillPassword(user.getPass()).signIn();
    }

    public boolean isUserSignedIn() {
        return inbox.getUserName().equals(user.getUsername());
    }

    @AfterClass(description = "close browser")
    public void kill() {
        Driver.getWebDriverInstance().quit();
    }
}
