package techproed.tests.day25_ExcelUtils;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.GooglePage;
import techproed.utilities.Driver;

public class C04_DataProviderPractice {

    @DataProvider (name = "testYeni")
    public static Object[][] urunler() {
        return new Object[][]{{"elma","kırmızı", "1"}, {"armut", "sari", "2"},{"erik", "yesil", "3"}, {"kiraz","mavi", "4"},{"cilek", "siyah", "5"} };
    }

    @DataProvider
    public static Object[][] araclar() {
        return new Object[][]{{"volvo"}, {"honda"}, {"mercedes"}};
    }

    @Test(dataProvider = "urunler")
    public void testDataProvider(String data, String meta, String sayi) {
        System.out.println(data + "||" + meta + "||" + sayi);
    }

    @Test (dataProvider = "testYeni")
    public void testYeni(String data, String meta, String sayi) {
        System.out.println(data + "||" + meta + "||" + sayi);
    }

    @Test(dataProvider = "araclar")
    public void testAraclar(String arac) {
        Driver.getDriver().get("https://google.com");
        GooglePage googlePage = new GooglePage();
        googlePage.aramaKutusu.sendKeys(arac, Keys.ENTER);
        Driver.closeDriver();
    }
}
