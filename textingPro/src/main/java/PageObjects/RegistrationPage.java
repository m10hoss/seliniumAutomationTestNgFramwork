package PageObjects;

import CoreClasses.BasePage;
import cucumber.api.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class RegistrationPage extends BasePage {


    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public Boolean VerifyTitle() {

        String Title = getTitleOfCurrentPage();
        if (Title.contains("Register")) {
            return true;
        }

        return false;
    }

    public void FillPersonalInfo() {

        SendKeys(By.id("companyName"), "ABC Business");
        SendKeys(By.id("firstName"), "myName");
        SendKeys(By.id("lastName"), "lastName");
    }

    public void FillPersonalContctDetials() {
        SendKeys(By.id("mobile"), "1112223333");
        SendKeys(By.id("EmailAddree"), "Abc@gamil.com");
    }

    public void FillPassword() {
        SendKeys(By.id("password"), "1234567");
        SendKeys(By.id("ConfirmPassword"), "1234567");
    }

    public void SelectDropdown() {

        SelectOptionFromDropDown(By.name("country"),"Anguilla");

        SelectOptionFromDropDown(By.name("hearabout"),"Friend");

        SelectOptionFromDropDown(By.name("plan"),"Pay as You Go--$0.00");

        SelectOptionFromDropDown(By.name("paymenttype"),"Credit card");

//old Method
//        WebElement countrydropdown = driver.findElement(By.xpath("//select[@name='country']"));
//        Select s = new Select(countrydropdown);
//        s.selectByVisibleText("Uganda");

//        WebElement hearAbout = driver.findElement(By.xpath("//select[@name='hearabout']"));
//        Select hear = new Select(hearAbout);
//        hear.selectByVisibleText("Google Search");
//
//        WebElement choosePlan = driver.findElement(By.xpath("//select[@name='plan']"));
//        Select plan = new Select(choosePlan);
//        plan.selectByVisibleText("ELITE--$100.00");
//
//        WebElement paymentOption = driver.findElement(By.xpath("//select[@name='paymenttype']"));
//        Select payment = new Select(paymentOption);
//        payment.selectByVisibleText("Credit card");


    }

    public void TermsAndConditions() {
       Click(By.id("TermsAndConditions"));
    }

//    public void clickRegister(){
//        Click(By.id("button"));
//    }
}
