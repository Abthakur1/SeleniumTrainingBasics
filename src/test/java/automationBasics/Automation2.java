package automationBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Automation2 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximize the browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// timeout
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        driver.get("https://qa-practice.netlify.app/");
        driver.findElement(By.id("auth-shop")).click();
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("abcd@gmail.com");
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("pass@1234");
        driver.findElement(By.id("submitLoginBtn")).click();
        driver.quit();
    }
}
