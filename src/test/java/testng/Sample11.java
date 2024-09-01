package testng;

import org.testng.annotations.Test;

public class Sample11 {
    @Test(dataProvider = "dp",dataProviderClass = DataProviderExample.class)
    public void testLogin(String username, String password, String name) {
        System.out.println(username);
        System.out.println(password);
        System.out.println(name);
    }
}
