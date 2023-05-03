package techproed.tests.day25_ExcelUtils;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPagePractice;
import techproed.utilities.ConfigReader;

import techproed.utilities.Driver;
import techproed.utilities.DriverPractice;
import techproed.utilities.ExcelUtilsPractice;

public class C02_BlueRentalExcelTest1Practice {

    @Test
    public void excelTest1() {
        //Bluerantal car adresine gidelim.
        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarsUrl"));

        //Excel dosyamızdan aldıgımız ilk emaıl ve password ile sayfaya login olalım.
        BlueRentalPagePractice blueRentalPagePractice = new BlueRentalPagePractice();
        blueRentalPagePractice.login1.click();
        ExcelUtilsPractice excelUtilsPractice = new ExcelUtilsPractice("src/test/java/resources/mysmoketestdata.xlsx","customer_info");
        String email = excelUtilsPractice.getCellData1(1,0);
        String password = excelUtilsPractice.getCellData1(1,1);

        blueRentalPagePractice.email1.sendKeys(email, Keys.TAB, password, Keys.ENTER);

        //Login oldugumuzu dogrulyalım.
        Assert.assertTrue(blueRentalPagePractice.verify.isDisplayed());
    }
}

