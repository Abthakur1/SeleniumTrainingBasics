package automationBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Frames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximize the browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// timeout
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        driver.get("https://qa-practice.netlify.app/");
        driver.findElement(By.xpath("//a[@id='iframes']")).click();
//        driver.switchTo().frame(0);
        driver.switchTo().frame("iframe-checkboxes");
        String message = driver.findElement(By.xpath("//h1")).getText();
        System.out.println(message);
        // to come out of the frame:
        driver.switchTo().defaultContent();
        driver.quit();
    }
}
