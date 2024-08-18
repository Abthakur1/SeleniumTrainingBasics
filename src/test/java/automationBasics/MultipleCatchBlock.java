package automationBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class MultipleCatchBlock {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximize the browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// timeout
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        try {
            driver.get("https://qa-practice.netlify.app/");
            String title = driver.getTitle();  // to get the title of the page
            System.out.println(title);
            WebElement ecommerceElement = driver.findElement(By.xpath("//a[@id='auth-shop-wrong']"));
            ecommerceElement.click();
        } catch (NoSuchElementException e) {
            System.out.println("Catch under no such element");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Catch under common exception");
            System.out.println(e.getMessage());
        } finally {
            driver.quit();
        }

    }
}
