package testng;

import org.testng.annotations.Test;

public class Sample4 {

    @Test (priority = 1)
    public void tc02(){
        System.out.println("test case 2 code");
    }

    @Test (priority = 4)
    public void tc01(){
        System.out.println("test case 1 code");
    }

    @Test (priority = 2)
    public void tc04(){
        System.out.println("test case 4 code");
    }

    @Test (priority = 3)
    public void tc03(){
        System.out.println("test case 3 code");
    }
}
