package techproed.tests.day23_DependsOnMethods;

import org.testng.annotations.Test;
import techproed.utilities.ConfigReaderPractice;
import techproed.utilities.Driver;

public class C04_DriverTestPractice {

    @Test
    public void driverTest1() {

        Driver.getDriver().get("https://techproeducation.com");
        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().get("https://facebook.com");
        Driver.getDriver().get(ConfigReaderPractice.getProperty("techproed_Url"));
        System.out.println(ConfigReaderPractice.getProperty("user_name"));
        System.out.println(ConfigReaderPractice.getProperty("password"));
    }
}
