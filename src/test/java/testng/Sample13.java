package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample13 {

    @BeforeMethod
    public void preSetup() {
        System.out.println("pre setup done before each test case ");
    }
    @Test
    public void tc01(){
        System.out.println("test case 1 executes");

    }

    @Test
    public void tc02(){
        System.out.println("test case 2 executes");

    }

    @Test
    public void tc03(){
        System.out.println("test case 3 executes");

    }
    @Test
    public void tc04(){
        System.out.println("test case 4 executes");

    }
    @Test
    public void tc05(){
        System.out.println("test case 5 executes");

    }

    @AfterMethod
    public void cleanUp() {
        System.out.println("clean up after each test case");
    }
}
