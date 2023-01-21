package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT01_NavigateTitleAssertScreenshot {
    @Test
    public void Navigation() throws IOException {
        //chromedriver setup
        WebDriverManager.chromedriver().setup();
        //this below line will open chrome browser
        WebDriver driver = new ChromeDriver();
        //maximze the browser
        driver.manage().window().maximize();
        //Navigaate to a website
        driver.get("https://www.thegoodguys.com.au/");
        //Implicit wait
        //if it takes more than 20sec , test case will fail and
        //we see pageloadtimeout error message
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // get title of the homepage
        String ActualTitle = driver.getTitle();
        System.out.println("ActualTitle : "+ActualTitle);
        String ExpectedTitle = "The Good Guys - Online Electrical & Home Appliances";
        //Assertion version-1
        Assert.assertEquals(ExpectedTitle,ActualTitle);
        //Assertion Version-2
        Assert.assertTrue(ActualTitle.contains("Electrical"));
        //screenshot
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //use ur path below
        //FileUtils.copyFile(screenshotFile, new File("C:\\Users\\softw\\IdeaProjects\\STL-VenkyProject\\src\\test\\java\\screenshot.png"));
        FileUtils.copyFile(screenshotFile, new File(System.getProperty("user.dir")+"\\src\\test\\java\\screenshots\\capture-1.jpeg"));




    }
}
