package PageObjects;

import CoreClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage extends BasePage {

    public ContactUsPage(WebDriver driver){
        super(driver);
    }

    public Boolean VerifyContactUs(){

        String contactUs = getTitleOfCurrentPage();
        if (contactUs.contains("Contact Us")){
            return true;
        }
        return false;
    }

    public void FillContactUs(){

        SendKeys(By.id("name"),"arman");
        SendKeys(By.id("email"),"arman123@gmail.com");
        SendKeys(By.id("sub"),"hello");
        SendKeys(By.id("message"),"i have a problem");
    }
    public void SubmitContactUs(){
        Click(By.xpath("//*[@id=\"wpcf7-f2482-p23-o1\"]/p[5]/input"));
    }
    public void AcceptingPopUpAlerts(){
        String PopUpText = getPopUpAlertText();

    }
    public boolean verifyContactUsPopUpText(){
        if (getPopUpAlertText().contains("Thank you")){
            return true;
        }
        return false;
    }
    public void acceptContactUsPopUp(){
        getPopUpAlertText();
    }


}
