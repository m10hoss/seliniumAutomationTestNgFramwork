package CoreClasses;

import Utility.Screenshot;
import org.apache.log4j.PropertyConfigurator;
import org.jsoup.Connection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;
    ExtendReportGenerator extendreport;

    public BaseTest(){
        extendreport = new ExtendReportGenerator();
    }

    @BeforeSuite
    public void beforeSuit(){
        extendreport.startExtentReport();
    }
    @AfterSuite
    public void afterSuit(){
        extendreport.endExtentReport();
    }

    @BeforeTest
    public void openBrowser() throws InterruptedException {

        PropertyConfigurator.configure("log4j.properties");

        //System.setProperty("webdriver.gecko.driver","/Users/armanhossain/IdeaProjects/geckodriver");

        //driver = new FirefoxDriver();

        System.setProperty("webdriver.chrome.driver","/Users/armanhossain/IdeaProjects/chromedriver");

        driver = new ChromeDriver();

        driver.manage().window().fullscreen();

        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        OpenWebsiteURL();
    }
    public void OpenWebsiteURL() throws InterruptedException {
        driver.get("https://google.com/");
        Thread.sleep(10000);
        //driver.get("http://www.way2automation.com/");
    }

    @AfterTest
    public void CloseBrowser() throws IOException {

        driver.close();
        driver.quit();
    }

    @BeforeMethod
    public void beforeMetohod(Method method){
        System.out.println(method.getName());
       extendreport.createExtentReport(method);
    }

    @AfterMethod
    public void aftermethod(ITestResult result) throws IOException {
        if (result.getStatus() == 2){
            Screenshot.takeSnapshot(driver);
        }
        extendreport.captureTestResult(result);
    }

}
