package techproed.tests.day26_ExcelDataProvider;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C01_DataProvider {

    @DataProvider
    public static Object[][] kullanicilar() {
        return new Object[][]{{ConfigReader.getProperty("email1"), ConfigReader.getProperty("password1")},
                            {ConfigReader.getProperty("email2"), ConfigReader.getProperty("password2")},
                            {ConfigReader.getProperty("email3"), ConfigReader.getProperty("password3")},
                            {ConfigReader.getProperty("email4"), ConfigReader.getProperty("password4")}};
    }

    @Test(dataProvider = "kullanicilar")
    public void test1(String email, String password) {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarsUrl"));
        BlueRentalPage blueRentalPage = new BlueRentalPage();
        blueRentalPage.login.click();//login buttonuna tıklar
        blueRentalPage.email.sendKeys(email, Keys.TAB, password, Keys.ENTER);
        ReusableMethods.bekle(3);
        Driver.closeDriver();
    }
}
