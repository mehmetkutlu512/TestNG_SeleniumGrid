package techproed.tests.day28_Listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ListenersRetry;

public class C03_ListenersTest3 {
    /*
        Test class'ımızda fail olma durumu olan bir testin listeners ile tekrar çalışmasını istersek
    @Test notasyanundan sonra parametre olarak retryAnalyzer yazar ve oluşturmuş olduğumuz ListenersRetry class'ının
    yolunu belirtiriz.
     */

    @Test(retryAnalyzer = techproed.utilities.ListenersRetry.class)
    public void test1() {
        System.out.println("PASSED");
        Assert.assertTrue(true);
        Assert.assertEquals(2,2);
    }

    @Test(retryAnalyzer = techproed.utilities.ListenersRetry.class)
    public void test2() {
        System.out.println("FAILED");
        Assert.assertTrue(false);
        Assert.assertEquals(2,1);
    }

    @Test(retryAnalyzer = techproed.utilities.ListenersRetry.class)
    public void test3() {
        System.out.println("SKIP");
        throw new SkipException("Method Atlandı"); //Tesi atlar yani ignore eder.
    }

    @Test(retryAnalyzer = techproed.utilities.ListenersRetry.class)
    public void test4() {
        System.out.println("NO SUCH ELEMENT EXCEPTION");
        // throw new NoSuchElementException("NoSuchElementException");

        Driver.getDriver().get(ConfigReader.getProperty("amazon_Url"));
        Driver.getDriver().findElement(By.xpath("asdfghjk"));
    }
}
