package PageObjects;

import CoreClasses.BasePage;
import org.openqa.selenium.WebDriver;

public class SeleniumTutorialPage extends BasePage {

    public SeleniumTutorialPage(WebDriver driver) {
        super(driver);
    }

    public boolean verifyURLName(){
        SwitchToNewWindow();
        if (getUrlOfCurrentPage().contains("selenium")){
            return true;
        }
        return false;
    }
}
