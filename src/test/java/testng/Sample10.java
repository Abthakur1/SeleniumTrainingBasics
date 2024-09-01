package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample10 {
    @Parameters({"username", "password"})
    @Test
    public void loginTest(String uname, String pwd){
        System.out.println(uname);
        System.out.println(pwd);

    }
}
