package NewPopUpWindow;

import CoreClasses.BaseTest;
import org.apache.log4j.Logger;
import PageObjects.SeleniumTutorialPage;
import PageObjects.WayToHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandlingMultipleWindowsTest extends BaseTest {

    private static final Logger LOGGER = Logger.getLogger(HandlingMultipleWindowsTest.class);

    @Test
    public void verifyBuyNowTitle() throws InterruptedException {

        WayToHomePage waytohomepage = new WayToHomePage(BaseTest.driver);
        SeleniumTutorialPage seleniumTutorialPage = new SeleniumTutorialPage(BaseTest.driver);
        waytohomepage.clickOnBuyNow();

        Thread.sleep(3000);

        if (seleniumTutorialPage.verifyURLName()){
            LOGGER.info("test case passed");
        } else{
            System.out.println("test case failed");
            LOGGER.info("test case failed bc we are not in Buy Now Page");
        }
        if (waytohomepage.verifyUrlofHomePage()){
            LOGGER.info("test case passed");
        } else{
            System.out.println("test case failed");
            LOGGER.info("test case failed bc we are not in the home page");
        }

        waytohomepage.SwitchToMainPage();

    }
}
