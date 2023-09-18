package PageObjects;

import CoreClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WayToHomePage extends BasePage {

    String window;
    public WayToHomePage(WebDriver driver){
            super(driver);
    }

    public void clickOnBuyNow(){
        window = getCurrentWindowId();
        Click(By.xpath("/html[1]/body[1]/div[4]/div[1]/header[1]/div[2]/div[1]/div[2]/div[1]/a[2]"));

    }
    public boolean verifyUrlofHomePage(){
        swithToParentWindow(window);
        if (getUrlOfCurrentPage().contains("automation")){
            return true;
        }
        return false;
    }

    public void SwitchToMainPage(){
        switchToMainContent();
    }

}
