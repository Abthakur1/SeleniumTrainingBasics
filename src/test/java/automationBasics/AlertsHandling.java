package automationBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AlertsHandling {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximize the browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// timeout
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        driver.get("https://qa-practice.netlify.app/");
        driver.findElement(By.id("alerts")).click();
        driver.findElement(By.id("alert-btn")).click();

        try {

            driver.switchTo().alert().accept();
//        driver.switchTo().alert().dismiss(); -- decline
            driver.findElement(By.id("confirm-btn")).click();

            String textOnAlert = wait.until(ExpectedConditions.alertIsPresent()).getText();
            System.out.println(textOnAlert);
            driver.switchTo().alert().accept();
        } catch (Exception e) {
            System.out.println("There was no alert");
        }

        // other way to grab the text from alert
        //driver.switchTo().alert().getText();
//        driver.quit();

    }
}
