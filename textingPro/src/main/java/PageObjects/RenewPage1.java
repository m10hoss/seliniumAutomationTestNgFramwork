package PageObjects;

import CoreClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class RenewPage1 extends BasePage {
    public RenewPage1(WebDriver driver) {
        super(driver);
    }

    public boolean verifyUserOnRenewPage() throws IOException {
        String text = getText(By.xpath("//a[contains(text(),'Renew Now')]"));
        if (text.contains("Renew Now")){
            return true;
        }
        return false;
    }
}
