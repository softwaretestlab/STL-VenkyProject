package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class latitudeRegNav {

    @Test
    public void NavLat() throws InterruptedException {
        //chromedriver setup
        WebDriverManager.chromedriver().setup();
        //this below line will open chrome browser
        WebDriver driver = new ChromeDriver();
        //maximze the browser
        driver.manage().window().maximize();
        //Navigaate to a website
        driver.get("https://www.latitudefinancial.com.au/");
        driver.findElement(By.xpath("//button[@class='logon-button mobile-visible']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[contains(text(),'NEW Latitude Service Centre')]")).click();
    }
}
