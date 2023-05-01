package techproed.tests.day25_ExcelUtils;

import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;

public class C03_BlueRentalExcelTest2 {
    @Test
    public void test1() {
                /*
        Excel dosyamızdaki tüm email ve password'ler ile
        BlueRentalCar sayfasına gidip login olalım
         */
        ExcelUtils excelUtils = new ExcelUtils("src/test/java/resources/mysmoketestdata.xlsx","customer_info");
        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarsUrl"));

        //Bir loop oluşturup excel dosyasındaki tüm verileri girdirelim
        for (int i=1; i< excelUtils.rowCount(); i++){

        }


    }
}
