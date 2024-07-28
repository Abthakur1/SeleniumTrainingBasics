package automationBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Scrolling {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximize the browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// timeout
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        driver.get("https://qa-practice.netlify.app/");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,700)", "");
        WebElement ele = driver.findElement(By.id("pagination"));
        Actions a = new Actions(driver);
        a.moveToElement(ele).build().perform();
        a.moveToElement(ele).contextClick().build().perform();
        driver.quit();

    }
}
