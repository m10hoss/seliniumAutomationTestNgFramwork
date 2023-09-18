package PageObjects;

import CoreClasses.BasePage;
import CoreClasses.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NegativeLogIn extends BasePage {

    public NegativeLogIn (WebDriver driver) {
        super(driver);
    }

    public Boolean VerifyTitle() {

        String Title = getTitleOfCurrentPage();
        if (Title.contains("Log In")) {
            return true;
        }

        return false;
    }

    public void LoginCredentials(){
        SendKeys(By.id("userName"),"WRONGEMAIL@gmail.com");
        SendKeys(By.id("password"),"123456");
    }

}
