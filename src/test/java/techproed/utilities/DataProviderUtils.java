package techproed.utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {
    @DataProvider
    public Object[][] sehirVerileri() {
        return new Object[][]{{"Ankara", "IcAnadolu", "06"}, {"Izmir", "Ege", "35"}, {"Diyarbakir", "Dogu", "21"}};
    }

    @DataProvider
    public Object[][] kullanicilar() {
        return new Object[][]{{"Erol", "123456"}, {"Nuri", "987654"}, {"Gul", "456820"}};
    }

    @DataProvider
    public Object[][] bluRental() {
        ExcelUtils excelUtils = new ExcelUtils("src/test/java/resources/mysmoketestdata.xlsx", "customer_info");

        return excelUtils.getDataArray();
    }
}
