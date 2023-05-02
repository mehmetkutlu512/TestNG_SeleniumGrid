package techproed.tests.day24_Properties_Pages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.OpenSourcePagePractice;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C02_PageKullanimiPractice {
    @Test
    public void test1() {
        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adrese gidelim
        Driver.getDriver().get(ConfigReader.getProperty("opensource_Url"));

        //kullaniciAdi, kullaniciSifre, submitButton elementlerini locate edelim
        OpenSourcePagePractice openSourcePagePractice = new OpenSourcePagePractice();
        openSourcePagePractice.username.sendKeys("Admin");
        openSourcePagePractice.password.sendKeys("admin123");
        openSourcePagePractice.login.click();

        //Login Testinin basarili oldugunu test et
        Assert.assertTrue(openSourcePagePractice.dashboard.isDisplayed());



    }
}
