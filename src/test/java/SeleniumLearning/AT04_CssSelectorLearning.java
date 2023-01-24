package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AT04_CssSelectorLearning {

    @Test
    public void css() throws InterruptedException {

        //Setting up chromedriver.
        WebDriverManager.chromedriver().setup();
        //we create an object of WebDriver
        WebDriver driver = new ChromeDriver();
        //At this point browser will be opened
        //maximize browser
        driver.manage().window().maximize();
        // navigate to HN website
        driver.get("https://www.thegoodguys.com.au/UserRegistrationForm?myAcctMain=1&new=Y&catalogId=30000&langId=-1&storeId=900");
        //CSS version-1
        driver.findElement(By.cssSelector("input[placeholder^='F']")).sendKeys("Venky");
        //CSS Version-2
        driver.findElement(By.cssSelector("input[placeholder$='Last Name*']")).sendKeys("Testing");
        //CSS Version-3
        driver.findElement(By.cssSelector("input[type*='email']")).sendKeys("password");
        //CSS Verstion-4
        Thread.sleep(10000);
        WebElement CreateAccElement = driver.findElement(By.id("regAddForm_mobileNum"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CreateAccElement);
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input#regAddForm_mobileNum")).click();
        driver.findElement(By.cssSelector("input#regAddForm_mobileNum")).sendKeys("0490876543");



    }
}
