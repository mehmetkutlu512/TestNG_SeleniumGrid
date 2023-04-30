package techproed.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    /*
    Driver class'ındaki temel mantık extends yöntemiyle değil yani TestBase class'ına extend etmek yerine
    Driver class'ından static methodlar kullanarak driver oluştururuz. Static olduğu için class ismi ile
    her yerden methoda ulaşabileceğiz.
     */
    static WebDriver driver;

    public static WebDriver getDriver (){
        /*
        Driver'i her çağırdığımda yeni bir pencere açılmasının önüne geçmek için
        if bloğu içinde eğer driver'a değer atanmamışsa değer ata, Eğer değer atanmışsa Driver'ı
        aynı sayfada RETURN et. Bunun için sadece yapmamız gereken if (driver==null) kullanmak
         */
        if (driver==null){
            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }


        return driver;
    }

    public static void closeDriver (){
        driver.close();
    }




}
