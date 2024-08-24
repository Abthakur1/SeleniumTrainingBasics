package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Sample2 {

    @Test
    public void tc01() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximize the browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// timeout
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        driver.get("https://qa-practice.netlify.app/");
        String title = driver.getTitle();  // to get the title of the page

        // validate that the title of page is QA Practice | Learn with RV.
        String expectedTitle = "QA Practice | Learn with RV";
        Assert.assertEquals(title,expectedTitle);

        WebElement ecommerceElement = driver.findElement(By.xpath("//a[@id='auth-shop']"));
        wait.until(ExpectedConditions.visibilityOf(ecommerceElement));
        wait.until(ExpectedConditions.elementToBeClickable(ecommerceElement)).click();
        driver.quit();  // it quits/clears all the instances of driver

    }
}
