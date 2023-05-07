package techproed.tests.day28_Listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

@Listeners(techproed.utilities.ListenersPractice.class)
public class C01_ListenersTest1Practice {

    @Test
    public void test1() {
        System.out.println("PASSED");
        Assert.assertTrue(true);
        Assert.assertEquals(2,2);
    }

    @Test
    public void test2() {
        System.out.println("FAILED");
        Assert.assertTrue(false);
        Assert.assertEquals(2,1);
    }

    @Test
    public void test3() {
        System.out.println("SKIP");
        throw new SkipException("Method Atlandı"); //Tesi atlar yani ignore eder.
    }

    @Test
    public void test4() {
        System.out.println("NO SUCH ELEMENT EXCEPTION");
        // throw new NoSuchElementException("NoSuchElementException");

        Driver.getDriver().get(ConfigReader.getProperty("amazon_Url"));
        Driver.getDriver().findElement(By.xpath("asdfghjk"));
    }
}
