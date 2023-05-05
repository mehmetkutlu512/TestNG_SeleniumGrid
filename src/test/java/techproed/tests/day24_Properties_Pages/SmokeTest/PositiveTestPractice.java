package techproed.tests.day24_Properties_Pages.SmokeTest;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPagePractice;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class PositiveTestPractice {
    @Test
    public void test1() {
                        /*
        Acceptance Criteria:
        Admin olarak, uygulamaya giriş yapabilmeliyim
        https://www.bluerentalcars.com/
        Admin email: jack@gmail.com
        Admin password: 12345
         */

        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarsUrl"));

        BlueRentalPagePractice blueRentalPagePractice = new BlueRentalPagePractice();
        blueRentalPagePractice.login1.click();
        blueRentalPagePractice.email1.sendKeys("jack@gmail.com", Keys.TAB, "12345", Keys.ENTER);
        assert blueRentalPagePractice.verify.getText().contains("Jack Nicholson");


    }
}
