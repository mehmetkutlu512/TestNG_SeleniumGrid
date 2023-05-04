package techproed.tests.day25_ExcelUtils;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C05_DataProviderPractice {
    @DataProvider
    public static Object[][] loginIslemi() {
        return new Object[][]{{"sam.walker@bluerentalcars.com","c!fas_art"},{"kate.brown@bluerentalcars.com","tad1$Fas"}};
    }

        /*
        sam.walker@bluerentalcars.com	c!fas_art
        kate.brown@bluerentalcars.com	tad1$Fas
        raj.khan@bluerentalcars.com	v7Hg_va^
        pam.raymond@bluerentalcars.com	Nga^g6!
        Verileri kullanarak bluerentalcar sayfasına login olalim

    */


    @Test(dataProvider = "loginIslemi")
    public void testBlueRental(String email, String password) {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarsUrl"));
        BlueRentalPage blueRentalPage = new BlueRentalPage();
        blueRentalPage.login.click();
        blueRentalPage.email.sendKeys(email, Keys.TAB, password, Keys.ENTER);
        ReusableMethods.bekle(2);
        blueRentalPage.login3.click();
        blueRentalPage.logout.click();
        blueRentalPage.ok.click();
        ReusableMethods.bekle(2);


    }

    @Test(dependsOnMethods = "testBlueRental")
    public void testSayfaKapama() {

        Driver.closeDriver();

    }
}
