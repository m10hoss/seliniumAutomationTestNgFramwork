package ContactUs;

import CoreClasses.BaseTest;
import PageObjects.ContactUsPage;
import PageObjects.MenuPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsTest extends BaseTest {

    @Test
    public void VerifyContactUs() throws InterruptedException{

        MenuPage menuPage = new MenuPage(BaseTest.driver);
        menuPage.ClickOnMenu("Contact Us");

        ContactUsPage contactuspage = new ContactUsPage(BaseTest.driver);

        contactuspage.FillContactUs();

        contactuspage.SubmitContactUs();

        contactuspage.AcceptingPopUpAlerts();

        if (contactuspage.verifyContactUsPopUpText()){
            System.out.println("contact us message displayed successfuly");
        }
        else {
            System.out.println("contact us message did not display");
            Assert.assertTrue(false);
        }

        contactuspage.acceptContactUsPopUp();
    }
}
