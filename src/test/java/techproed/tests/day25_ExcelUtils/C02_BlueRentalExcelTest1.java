package techproed.tests.day25_ExcelUtils;

import org.testng.annotations.Test;
import techproed.utilities.ExcelUtils;

public class C02_BlueRentalExcelTest1 {
    @Test
    public void excelTest() {
        ExcelUtils excelUtils = new ExcelUtils("src/test/java/resources/mysmoketestdata.xlsx","customer_info");
        //Bluerantal car adresine gidelim.
        //Excel dosyamızdan aldıgımız ilk emaıl ve password ile sayfaya login olalım.
        //Login oldugumuzu dogrulyalım.

    }
}
