package PageObjects;

import CoreClasses.BasePage;
import CoreClasses.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

    public class MenuPage extends BasePage {
        public MenuPage(WebDriver driver) {
            super(driver);
        }
        //By menu = By.xpath("")

        public void ClickOnMenu(String menuname) throws InterruptedException
        {
            Thread.sleep(10000);
            Click(By.xpath("//*[@id='cssmenu']//a[text()='" + menuname + "']"));

             //explicit wait implemination driver.manage().timeouts().implicitlyWait(10, Time)

//            WebDriverWait wait = new WebDriverWait(BaseTest.driver,20);
//            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("")));
        }
}
