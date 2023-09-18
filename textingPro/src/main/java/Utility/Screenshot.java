package Utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Screenshot {

    public static void takeSnapshot(WebDriver driver) throws IOException {

        // convert webdriver object to text screens shot
        TakesScreenshot takeScreenShot = ((TakesScreenshot) driver);

        // call getScreenShotAs method to create image file
        File srcfile = takeScreenShot.getScreenshotAs(OutputType.FILE);

        // move image file to new destination

        File destinationPath = new File("/Users/armanhossain/IdeaProjects/textingPro/screenshots/error_" + currentDateTime()+".png");

        // copy file at destination
        FileUtils.copyFile(srcfile, destinationPath);
    }
    public static String currentDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd HH_mm_ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        return dateFormat.format(date);

    }

}
