package LogIn;

import CoreClasses.BaseTest;
import PageObjects.LoginPage;
import PageObjects.MenuPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class UncessfulLogInTest extends BaseTest {


    @Test

    public void VerifyUncessfulLogIn() throws InterruptedException, IOException {
        MenuPage menuPage = new MenuPage(BaseTest.driver);

        menuPage.ClickOnMenu("Log In");

        LoginPage loginPage = new LoginPage(BaseTest.driver);
        Assert.assertTrue(loginPage.VerifyTitle(),"Title and Url of register page dose not match");

        loginPage.VerifyTitle();

        loginPage.LoginCredentials();
    }
}
