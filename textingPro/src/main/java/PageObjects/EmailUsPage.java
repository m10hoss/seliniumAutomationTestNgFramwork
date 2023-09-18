package PageObjects;

import CoreClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailUsPage extends BasePage {

    public EmailUsPage(WebDriver driver) {
        super(driver);
    }
    public void FillInEmailUsInfo(){
        try{
            Thread.sleep(10000);
            Click(By.xpath("//div[@class='purechat-collapsed-outer purechat-display-block']//span[@class='purechat-widget-title-link'][contains(text(),'Contact us')]"));
        }
        catch(InterruptedException ie){
        }
        SendKeys(By.id("purechat-firstname-input"),"arman");
        SendKeys(By.id("purechat-lastname-input"),"hoss");
        SendKeys(By.id("purechat-email-input"),"123@gmail.com");
        SendKeys(By.id("purechat-phonenumber-input"),"1239998888");
        SendKeys(By.id("purechat-company-input"),"abcdCompany");
        SendKeys(By.id("purechat-question-input"),"hello world");
        Click(By.id("purechat-name-submit"));
    }
    public Boolean VerifyEmailUs(){
       String verifyemailus = getText(By.xpath("//*[@id='PureChatWidget']//h2//p"));

       if (verifyemailus.contains("Our Operator")){
           return true;
       }
       return false;
    }
}
