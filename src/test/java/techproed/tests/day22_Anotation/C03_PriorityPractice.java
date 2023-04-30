package techproed.tests.day22_Anotation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class C03_PriorityPractice {
    WebDriver driver;
    @Test(priority = -3)
    public void techproTest() {
        System.out.println("techproTest");    }

    @Test(priority = -1)
    public void amazonTest() {
        System.out.println("amazonTest");
    }

    @Test(priority = -2)
    public void facebookTest() {
        System.out.println("facebookTest");
    }

    @Test
    public void test2() {
        System.out.println("Test2 method");
    }

    @Test(priority = 1)
    public void test1() {
        System.out.println("Test1 method");
    }

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
