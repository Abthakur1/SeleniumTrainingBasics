package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class Automation1_testNg {
    WebDriver driver;
    @BeforeTest
    public void initialSetup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// timeout
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        driver.get("https://qa-practice.netlify.app/");
        String title = driver.getTitle();
        Assert.assertEquals(title, "QA Practice | Learn with RV");
    }

    @Parameters({"username","password"})
    @Test
    public void BasicLoginTest(String user, String pass){
        driver.findElement(By.id("auth-shop")).click();
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys(user);
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys(pass);
        driver.findElement(By.id("submitLoginBtn")).click();
        String phoneName = driver.findElement(By.xpath("(//span[@class='shop-item-title'])[1]")).getText();
        System.out.println(phoneName);
        boolean result = phoneName.contains("128GB");
        Assert.assertTrue(result);

    }

    @AfterTest
    public void cleanUp()
    {
        driver.quit();
    }
}
