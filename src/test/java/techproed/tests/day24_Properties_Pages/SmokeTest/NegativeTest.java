package techproed.tests.day24_Properties_Pages.SmokeTest;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class NegativeTest {
    @Test(groups = "smoke")
    public void test1() throws InterruptedException {
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
        Reporter.log("BlueRental Sayfasına gidildi");
        BlueRentalPage blueRentalPage=new BlueRentalPage();
        blueRentalPage.login.click();
        Reporter.log("Login butonuna tıklandı");

        blueRentalPage.email.sendKeys(ConfigReader.getProperty("fakeEmail"), Keys.TAB, ConfigReader.getProperty("fakepass"), Keys.ENTER);
        Thread.sleep(3000);
        Reporter.log("Email ve password girildi");
        blueRentalPage.login2.click();
        ReusableMethods.bekle(3);
        Reporter.log("Login2 yapıldı");

        ReusableMethods.tumSayfaResmi("TumSayfaResmi");
        Reporter.log("Sayfa resmi alındı");

        Assert.assertTrue(blueRentalPage.hataMesaji.isDisplayed());
        Reporter.log("Assert yapıldı");

        Driver.closeDriver();

    }

}
