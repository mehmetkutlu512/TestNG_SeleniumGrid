package techproed.tests.day23_DependsOnMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class C01_DependsOnMethods {
    /*
    Test methodları birbirinden bağımsız çalışır. Methodları birbirine bağımlı çalıştırmak istersek
    DependsOnMethods parametresini @Test notasyonundan sonra bağlamak istediğimiz test methodunun adını belirtiriz.
     */
    WebDriver driver;
    @Test
    public void amazonTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }

    @Test(dependsOnMethods = "amazonTest")
    public void amazonTest2() {
        driver.get("https://amazon.com");
        // Eğer dependsOnMethods kullanmazsak bu örnek için NullPointerException hatası alırız
    }

    @Test(dependsOnMethods = "amazonTest2")
    public void amazonTest3 () {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
    }
}
