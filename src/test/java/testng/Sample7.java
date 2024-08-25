package testng;

import org.testng.annotations.Test;

public class Sample7 {

    @Test(groups = "regression")
    public void m7() {
        System.out.println("Regression test m7 is executed");
    }
    @Test(groups = "regression")
    public void m8() {
        System.out.println("Regression test m8 is executed");
    }
    @Test(groups = "smoke")
    public void m9() {
        System.out.println("Smoke test m9 is executed");
    }
    @Test(groups = "smoke")
    public void m11() {
        System.out.println("Smoke test m11 is executed");
    }
    @Test(groups = "sanity")
    public void m10() {
        System.out.println("Sanity test m10 is executed");
    }
}
