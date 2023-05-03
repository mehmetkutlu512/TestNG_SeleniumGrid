package techproed.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class DriverPractice {

    private DriverPractice(){

    }

    static WebDriver driver;

    public static WebDriver getDriver (){
        /*
        Driver'i her çağırdığımda yeni bir pencere açılmasının önüne geçmek için
        if bloğu içinde eğer driver'a değer atanmamışsa değer ata, Eğer değer atanmışsa Driver'ı
        aynı sayfada RETURN et. Bunun için sadece yapmamız gereken if (driver==null) kullanmak
         */
        if (driver==null){
            switch (ConfigReader.getProperty("browser")){
                case "chrome" :
                    WebDriverManager.chromedriver().setup();
                    driver= new ChromeDriver();
                    break;
                case "edge" :
                    WebDriverManager.edgedriver().setup();
                    driver= new EdgeDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver= new ChromeDriver();

            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }


        return driver;
    }

    public static void closeDriver (){
        if (driver!=null){ //Driver'a değer atanmışsa
            driver.close();
            driver=null;
        }

    }

    public static void quitDriver (){
        if (driver!=null){ //Driver'a değer atanmışsa
            driver.quit();
            driver=null;
        }

    }


}
