package CoreClasses;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class BasePage {

    public WebDriver driver;
    public Alert alert;

    public BasePage(WebDriver driver) {
        this.driver = driver;

    }

    public void SendKeys(By by, String value) {
        driver.findElement(by).sendKeys(value);
    }

    public void Click(By by) {

        driver.findElement(by).click();
    }
    public void click(WebElement element){
        element.click();
    }

    public Boolean IsDisplaed(By by) {
        return driver.findElement(by).isDisplayed();
    }


    public String getTitleOfCurrentPage() {
        return driver.getTitle();
    }

    public void SelectOptionFromDropDown(By by, String option) {

        WebElement dropdown = driver.findElement(by);

        Select select = new Select(dropdown);

        select.selectByVisibleText(option);
    }


    public void switchToPopUp() {
        // used for in page pop up----not new window poppup
        alert = driver.switchTo().alert();
    }

    public String getPopUpAlertText() {
        switchToPopUp();
        String alertText = alert.getText();
        return alertText;
    }
    public void acceptContactUsPopUp(){
        alert.accept();

    }
    public String getText(By by){
        return driver.findElement(by).getText();
    }

    public String getUrlOfCurrentPage() {
        return driver.getCurrentUrl();
    }

    public void SwitchToNewWindow() {
        Set<String> allWindows = driver.getWindowHandles(); // all window is a reference variable
        System.out.println(allWindows);
        //enhanced for loop
        for (String window : allWindows) {
            driver.switchTo().window(window);
        }
    }
    public void switchToMainContent(){
        driver.switchTo().defaultContent();

    }
    public void swithToParentWindow(String Window){
        driver.switchTo().window(Window);
    }
    public String getCurrentWindowId(){
        String currentwindow = driver.getWindowHandle();
        return currentwindow;
    }


}
//    public void doubleClick(By by) { 
//        //getHighlingElement(driver.findElement(by)); 
//        Actions actions = new Actions(driver); 
//        WebElement elementLocator = driver.findElement(by); 
//        actions.doubleClick(elementLocator).perform(); 	}  
//
//    public void HitENTER(By by) { 
//        //getHighlingElement(driver.findElement(by)); 
//        driver.findElement(by).sendKeys(Keys.ENTER);  	}

