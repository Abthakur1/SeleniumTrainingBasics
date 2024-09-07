package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Sample14 {
    @Test
    public void practiceAssertion(){
        SoftAssert sa = new SoftAssert();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// timeout
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        driver.get("https://qa-practice.netlify.app/");
        String title = driver.getTitle();
        sa.assertEquals(title,"QA Pract | Learn with RV" );
        System.out.println("Test execution proceed even the test is failed");
        sa.assertAll(); // this is mandatory, otherwise in the execution result all the tests will show as passed even it is failed

    }
}
