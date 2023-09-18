package Register;

import CoreClasses.BaseTest;
import PageObjects.MenuPage;
import PageObjects.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {
    /*  
    1 Open Google Chrome   
    2 Open Test.Textingpro website.  
    3 Click on Register menu
      4 Verify user is on register page by title
      5 Fill personal info fields.
      6 Fill personal contact details fields  
    7 Fill passwords fields  
    8 Select all dropdown  
    9 Click on termandconditioncheckbox  
    10 Click on register button  

    User should be able to register successfully.*/

    @Test
    public void VerifyRegistriatoin() throws InterruptedException{

        MenuPage menupage = new MenuPage(BaseTest.driver);

        menupage.ClickOnMenu("Register");

        RegistrationPage registriationpage = new RegistrationPage(BaseTest.driver);
        Assert.assertTrue(registriationpage.VerifyTitle(),"Title and Url of register page dose not match");
        registriationpage.VerifyTitle();

        registriationpage.FillPersonalInfo();

        registriationpage.FillPersonalContctDetials();

        registriationpage.FillPassword();

        registriationpage.SelectDropdown();

        registriationpage.TermsAndConditions();

        //registriationpage.clickRegister();

    }
}
