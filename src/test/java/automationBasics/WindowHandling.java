package automationBasics;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class WindowHandling {

    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximize the browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// timeout
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        driver.get("https://qa-practice.netlify.app/");
        driver.findElement(By.xpath("//a[text()='New Tab / Window']")).click();
        driver.findElement(By.id("browser-tab")).click();
        driver.findElement(By.xpath("//a[text()='Press me - New Tab']")).click();
        Set<String> allwindowIds = driver.getWindowHandles();
        Iterator it = allwindowIds.iterator();
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        while (it.hasNext()) {
            String parentId = (String) it.next();  // parent
            String childId = (String) it.next();  // child window
            driver.switchTo().window(childId);
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            File destination = new File("src/test/Screenshots/child.png");
            FileUtils.copyFile(source, destination);
            Thread.sleep(5000);
//            driver.switchTo().defaultContent();
            driver.switchTo().window(parentId);
            Thread.sleep(5000);
            File parentSrc = screenshot.getScreenshotAs(OutputType.FILE);
            File destinationParent = new File("src/test/Screenshots/parent.png");
            FileUtils.copyFile(parentSrc, destinationParent);
        }
        Thread.sleep(5000);

        driver.quit();
    }
}
