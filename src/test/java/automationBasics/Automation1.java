package automationBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Automation1 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximize the browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// timeout
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        driver.get("https://qa-practice.netlify.app/");
        String title = driver.getTitle();  // to get the title of the page
        System.out.println(title);
        WebElement ecommerceElement = driver.findElement(By.xpath("//a[@id='auth-shop']"));
        wait.until(ExpectedConditions.visibilityOf(ecommerceElement));
        wait.until(ExpectedConditions.elementToBeClickable(ecommerceElement)).click();
//        ecommerceElement.click();

        driver.quit();  // it quits/clears all the instances of driver

        // what is the diff between driver.close and driver.quit()

        // implicit wait and explicitWat

        //WebDriver driver = new WebDriver();  --> not work, we cannot create an object of interface.
    }
}
