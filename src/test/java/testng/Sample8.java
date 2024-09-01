package testng;

import org.testng.annotations.Test;

public class Sample8 {
    @Test
    public void TestA_01() throws Exception {
        System.out.println("test case a_01 is executed successfully");
        throw new Exception();
    }
    @Test(dependsOnMethods = "TestA_01")
    public void TestA_02() {
        System.out.println("test case a_02 is executed successfully");
    }
    @Test
    public void TestA_03() {
        System.out.println("test case a_03 is executed successfully");
    }
}
