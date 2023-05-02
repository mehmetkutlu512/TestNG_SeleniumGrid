package techproed.tests.SmokeTest;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPagePractice;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class NegativeTestPractice {
    @Test
    public void test1() {
             /*
        Description:
        Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapilamamali
        Acceptance Criteria
        Customer email: fake@bluerentalcars.com
        Customer password: fakepass
        Error:
        User with email fake@bluerentalcars.com not found
         */
        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarsUrl"));

        BlueRentalPagePractice blueRentalPagePractice = new BlueRentalPagePractice();
        blueRentalPagePractice.login1.click();
        blueRentalPagePractice.email1.sendKeys("fake@bluerentalcars.com", Keys.TAB,
                                                "fakepass", Keys.ENTER);
        ReusableMethods.bekle(2);
        Assert.assertTrue(blueRentalPagePractice.hataMesaji1.isDisplayed());





    }
}
