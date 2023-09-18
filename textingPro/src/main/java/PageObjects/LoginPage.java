package PageObjects;

import CoreClasses.BasePage;
import CoreClasses.BaseTest;
import Utility.Screenshot;
import javafx.stage.Screen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static org.openqa.selenium.By.xpath;

public class LoginPage extends BasePage {

    //positive
    public LoginPage (WebDriver driver){
        super(driver);
    }

    public Boolean VerifyTitle() throws InterruptedException {
        Thread.sleep(5000);
        String Title = getTitleOfCurrentPage();
        System.out.println(Title);
        if (Title.contains("Login")){
            return true;
        }
        return false;
    }
    public void LoginCredentials() throws IOException {
        SendKeys(By.id("userName"),"shalinanabi3@gmail.com");
        SendKeys(By.id("password"),"123456");
        Click(xpath("//button[@class='btn btn-rounded btn-orange btn-sign-up']"));
        //Screenshot.takeSnapshot(BaseTest.driver);
    }
    public void ClickOnMenue (String menuname) throws InterruptedException{
        Thread.sleep(5000);

        Click(xpath("//[@id='cssmenu']//a[text()='" + menuname + "']"));
    }

    public void clickonloginButton(){
        Click(xpath("//a[contains(text(),'Login')]"));
    }








    //negative test cases
}
