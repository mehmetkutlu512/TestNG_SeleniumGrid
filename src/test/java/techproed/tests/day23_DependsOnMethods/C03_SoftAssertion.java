package techproed.tests.day23_DependsOnMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class C03_SoftAssertion {
    /*
    SoftAssert kullanmak için öncelikle bir obje oluşturmamız gerekir.
    Hard assertion da bir doğrulama fail olursa testin çalışması durur.
    SoftAssertion da assertAll() methodu ile testin farklı bölümlerinde softassert kullanarak
    doğrulama yapsak ta testi istediğimiz yerde sonlandırırız.

     */

    //İlk olarak
    SoftAssert softAssert;
    WebDriver driver;
    @Test
    public void amazonTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        ///İlk olarak sonrasında oluşturmuş olduğum obje ile assert methodları ile doğrulama yaparız
        //Son olarak objemi kullanarak assertAll() methodu kullanmam gerekir
        softAssert = new SoftAssert();

        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");

        //Url'in amazon.com.tr olup olmadığını doğrulayınız
        softAssert.assertEquals(driver.getCurrentUrl(),"https://amazon.com.tr");
        //Assert.assertEquals(driver.getCurrentUrl(),"https://amazon.com.tr");
        //Burda hard assertion kullandık ve hata olduğu için testi direk durdurdu

        //System.out.println("Bu assertion yanlış");


        //Başlığın best içerdiğini test edelim
        softAssert.assertTrue(driver.getTitle().contains("best"));
        System.out.println("Gerçekte best içermiyor");

        //Arama kutusunda iphone aratalım
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);

        //Sonucun samsung içerip içermediğini test edin
        WebElement sonuc = driver.findElement(By.xpath("(//*[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        softAssert.assertTrue(sonuc.getText().contains("samsung"));
        System.out.println("Gerçek sonuç Iphone olmalı");
        softAssert.assertAll();
        System.out.println("Test sonuçlandı");//Bunu yazdırmaz


    }




}
