package testng;

import org.testng.annotations.Test;

public class Sample9 {
    @Test(invocationCount = 10)
    public void tc01(){
        System.out.println("Test should run 10 times");

    }
}
