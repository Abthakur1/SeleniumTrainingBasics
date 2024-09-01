package testng;

import org.testng.annotations.DataProvider;

public class DataProviderExample {
    @DataProvider(name = "dp")
    public Object[][] getData () {
        return new Object[][] {
            {"u00" , "p01", "name02"},
            {"u10" , "p11", "name02"}
        };
    }
}
