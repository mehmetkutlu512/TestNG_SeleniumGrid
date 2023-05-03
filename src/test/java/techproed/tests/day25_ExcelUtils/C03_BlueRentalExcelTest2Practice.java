package techproed.tests.day25_ExcelUtils;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.*;

public class C03_BlueRentalExcelTest2Practice {

    @Test
    public void test1() {
                        /*
        Excel dosyamızdaki tüm email ve password'ler ile
        BlueRentalCar sayfasına gidip login olalım
         */

        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarsUrl"));
        ExcelUtils excelUtils = new ExcelUtils("src/test/java/resources/mysmoketestdata.xlsx","customer_info");

        //Bir loop oluşturup excel dosyasındaki tüm verileri girdirelim
        for (int i = 1; i <= excelUtils.rowCount(); i++) {
            BlueRentalPage blueRentalPage = new BlueRentalPage();
            blueRentalPage.login.click();
            ReusableMethods.bekle(2);
            String email = excelUtils.getCellData(i,0);
            String password = excelUtils.getCellData(i,1);
            blueRentalPage.email.sendKeys(email, Keys.TAB, password, Keys.ENTER);
            assert blueRentalPage.verify.isDisplayed();
            ReusableMethods.bekle(2);
            blueRentalPage.login3.click();
            ReusableMethods.bekle(2);
            blueRentalPage.logout.click();
            ReusableMethods.bekle(2);
            blueRentalPage.ok.click();

        }
    }
}
