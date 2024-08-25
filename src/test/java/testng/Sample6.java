package testng;

import org.testng.annotations.Test;

public class Sample6 {

    @Test(groups = "regression")
    public void m1() {
        System.out.println("Regression test m1 is executed");
    }
    @Test(groups = "regression")
    public void m2() {
        System.out.println("Regression test m2 is executed");
    }
    @Test(groups = {"smoke", "regression"})
    public void m3() {
        System.out.println("Smoke test m3 is executed");
    }
    @Test(groups = "smoke")
    public void m4() {
        System.out.println("Smoke test m4 is executed");
    }
    @Test(groups = "sanity")
    public void m5() {
        System.out.println("Sanity test m5 is executed");
    }
}
