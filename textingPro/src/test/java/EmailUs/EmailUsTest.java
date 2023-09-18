package EmailUs;

import CoreClasses.BasePage;
import CoreClasses.BaseTest;
import PageObjects.EmailUsPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class EmailUsTest extends BaseTest {

    @Test
    public void VerifyEmailUs() throws InterruptedException{

        EmailUsPage emailuspage = new EmailUsPage(BaseTest.driver);

        emailuspage.FillInEmailUsInfo();

        if (emailuspage.VerifyEmailUs()){
            System.out.println("test pass: we have successfuly sent email");
        }else {
            System.out.println("test fail: fail fail fail ");
            Assert.assertTrue(false);
        }
    }


}
