package LogIn;

import CoreClasses.BaseTest;
import PageObjects.LoginPage;
import PageObjects.MenuPage;
import PageObjects.RenewPage1;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

public class SuccessfulLogInTest extends BaseTest {

    @Test
    public void VerifySuccessfulLogIn() throws InterruptedException, IOException {

        MenuPage menupage = new MenuPage(BaseTest.driver);

        menupage.ClickOnMenu("Log In");

        LoginPage loginPage = new LoginPage(BaseTest.driver);
        Assert.assertTrue(loginPage.VerifyTitle(),"Title and Url of register page dose not match");

//        loginPage.loginfrields();
//
//        DashboardPage dashboardpage = new DashboardPage(BaseTest.driver);
//
//        if (dashboardpage.verifyUserOnRenewPage()){
//            System.out.println("Test Case Pass");
//        } else {
//            System.out.println("Test Case Failed becase user didnt redirect to the Renew page");
//        }

        loginPage.VerifyTitle();

        loginPage.LoginCredentials();

        RenewPage1 renewpage = new RenewPage1(BaseTest.driver);
        if (renewpage.verifyUserOnRenewPage()){
            System.out.println("test case passed");
        } else {
            System.out.println("test case failed");
            Assert.assertTrue(false,"test case failed becase uer didnt direct Renew Page");
        }
        Thread.sleep(10000);
    }
}
