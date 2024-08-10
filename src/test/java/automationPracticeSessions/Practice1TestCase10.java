package automationPracticeSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Practice1TestCase10 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("http://practice.automationtesting.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath(" //a[text()='Shop']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");

        driver.findElement(By.xpath("(//a[text()='Add to basket'])[1]")).click();
        driver.findElement(By.xpath("//span[text()='1 item']")).click();
        driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']")).click();

        driver.findElement(By.id("billing_first_name")).sendKeys("Rachit");
        driver.findElement(By.id("billing_last_name")).sendKeys("Bansal");
        driver.findElement(By.id("billing_email")).sendKeys("rachitb79@gmail.com");
        driver.findElement(By.id("billing_phone")).sendKeys("8149905337");
        driver.findElement(By.id("billing_address_1")).sendKeys("777A sadar bazar");
        driver.findElement(By.id("billing_city")).sendKeys("Ranikhet");
        driver.findElement(By.id("billing_postcode")).sendKeys("263645");
        JavascriptExecutor el = (JavascriptExecutor) driver;
        el.executeScript("window.scrollBy(0,500)");

        //driver.findElement(By.id("select2-chosen-2")).click();
        //driver.findElement(By.xpath("//input[@id='s2id_autogen1_search']")).sendKeys("Uttarkhand");
        //driver.findElement(By.xpath("//div[@role='option']")).click();
        driver.findElement(By.xpath("(//input[@name='payment_method'])[3]")).click();
        el.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);
        WebElement placeOrderButton = driver.findElement(By.xpath("//a[@title='View your shopping cart']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderButton)).click();

        String subTotal = driver.findElement(By.xpath("//table[@class='shop_table shop_table_responsive']//td[@data-title='Subtotal']//span[@class='woocommerce-Price-amount amount']")).getText();
        System.out.println(subTotal); //
        String[] subTotalSplit = subTotal.split("₹");
        String subTotalValue = subTotalSplit[1];
        double subTotalInDouble = Double.parseDouble(subTotalValue);
        int subTotalInInteger = (int) subTotalInDouble;
        System.out.println(subTotalInInteger);

        String total = driver.findElement(By.xpath("//table[@class='shop_table shop_table_responsive']//td[@data-title='Total']//span[@class='woocommerce-Price-amount amount']")).getText();
        System.out.println(total);
        String[] totalSplit = total.split("₹");
        String totalValue = totalSplit[1];
        double totalDouble = Double.parseDouble(totalValue);
        int totalInteger = (int) totalDouble;
        System.out.println(totalInteger);
        if (subTotalInInteger < totalInteger)
            System.out.println("Successfully user view Thank you. Your order has been received.");
        else
            System.out.println("Successfully user not view Thank you. Your order has been received.");
        driver.quit();
    }
}
