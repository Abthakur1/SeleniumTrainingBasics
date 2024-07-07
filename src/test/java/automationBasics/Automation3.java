package automationBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Automation3 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximize the browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// timeout
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        driver.get("https://www.saucedemo.com/v1/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();
        List <WebElement> addtoCarts = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
        int totalAddToCarts = addtoCarts.size();
        System.out.println(totalAddToCarts);

        for(int i =0; i<totalAddToCarts; i++ ) {
            addtoCarts.get(i).click();
        }

        int numofRemoves = driver.findElements(By.xpath("//button[text()='REMOVE']")).size();
        if(numofRemoves == 6) {
            System.out.println("test is passed with clicking all add to cart button");
        } else {
            System.out.println("test failed");
        }
        driver.quit();
    }
}
