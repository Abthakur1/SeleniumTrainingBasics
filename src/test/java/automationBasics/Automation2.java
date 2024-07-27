package automationBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("admin@admin.com");
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("admin123");
        driver.findElement(By.id("submitLoginBtn")).click();
        String phoneName = driver.findElement(By.xpath("(//span[@class='shop-item-title'])[1]")).getText();
        System.out.println(phoneName);
        if(phoneName.contains("128GB")) {
            System.out.println("test is passed");
        } else {
            System.out.println("test is failed");
        }

        driver.findElement(By.xpath("//span[text()='Apple iPhone 13, 128GB, Blue']//parent::div[@class='shop-item']//button[text()='ADD TO CART']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        driver.findElement(By.id("phone")).sendKeys("987676655676");
        driver.findElement(By.xpath("//input[@name='street']")).sendKeys("stree name-abc");
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("city name-Delhi");
        WebElement countryDropDown = driver.findElement(By.id("countries_dropdown_menu"));
        Select country = new Select(countryDropDown);
        country.selectByVisibleText("India");
        driver.findElement(By.id("submitOrderBtn")).click();
        boolean result = driver.findElement(By.id("message")).isDisplayed();
        String message = driver.findElement(By.id("message")).getText();
        if(result == true) {
            System.out.println("test is passed and message is displayed");
        }
        else
        {
            System.out.println("test is failed and message is not displayed");
        }

        if(message.contains("Congrats! Your order")) {
            System.out.println("test passed with congrats message");
        } else
        {
            System.out.println("test is failed without congrats message");
        }

        driver.quit();

    }
}
