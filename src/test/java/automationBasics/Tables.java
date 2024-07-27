package automationBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Tables {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximize the browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// timeout
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        driver.get("https://qa-practice.netlify.app/");
        driver.findElement(By.xpath("//a[@id='forms' and text()='Tables']")).click();
        driver.findElement(By.xpath("//a[text()='Static Table']")).click();
        List<WebElement> headersElements = driver.findElements(By.xpath("//table[@id='peopleTable']/thead/tr/th"));
        int totalHeaders = headersElements.size();
        System.out.println("total headers:" + totalHeaders);
        for (int i = 0; i < totalHeaders; i++) {
            String headerName = headersElements.get(i).getText();
            System.out.println(headerName); // # , First, Last, Email
        }

        int numberOfRows = driver.findElements(By.xpath("//table[@id='peopleTable']/tbody/tr")).size();
        int numberOfColums = driver.findElements(By.xpath("//table[@id='peopleTable']/tbody/tr[1]/td")).size();
        System.out.println("rows:" + numberOfRows);
        System.out.println("columns:" + numberOfColums);

        String hardcodedValue = driver.findElement(By.xpath("//table[@id='peopleTable']/tbody/tr[1]/td[2]")).getText();
        System.out.println("hardcoded row and colum:" + hardcodedValue);


        // dynamic code
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= numberOfColums; j++) {
                String val = driver.findElement(By.xpath("//table[@id='peopleTable']/tbody/tr[" + i + "]/td[" + j + "]")).getText();
                System.out.println("Row and columns: " + i+ ":" + j +":" + val);

            }
        }
        driver.quit();
    }
}
