package techproed.tests.day24_Properties_Pages;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.TestCenterTechproPagePractice;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C03_PageKullanimiPractice {
    @Test
    public void test1() {
        //https://testcenter.techproeducation.com/index.php?page=form-authentication
        Driver.getDriver().get(ConfigReader.getProperty("testCenterUrl"));

        //Page object Model kullanarak sayfaya giriş yapildigini test edin
        TestCenterTechproPagePractice testCenterTechproPagePractice = new TestCenterTechproPagePractice();
        testCenterTechproPagePractice.username1.sendKeys(ConfigReader.getProperty("kullaniciAdi"), Keys.TAB,
                                                        ConfigReader.getProperty("kullaniciPassword"), Keys.ENTER);
        //testCenterTechproPagePractice.submit.click();

        Assert.assertTrue(testCenterTechproPagePractice.loggedText.isDisplayed());

        //Sayfadan cikis yap ve cikis yapildigini test et
        testCenterTechproPagePractice.logout.click();
        assert testCenterTechproPagePractice.loginPageText.isDisplayed();


    }
}
