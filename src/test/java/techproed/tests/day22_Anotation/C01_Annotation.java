package techproed.tests.day22_Anotation;

import org.testng.annotations.*;

public class C01_Annotation {
    /*
    @Test: Testlerimizi yazmak için kullandığımız notasyondur.
    @BeforeSuite: Her bir test suite'nden önce bir kez çalışır.
    @AfterSuite: Her bir test suite'nden sonra bir kez çalışır.
    @BeforeTest: Her bir test öncesi bir kez çalışır.
    @AfterTest: Her bir test sonrası bir kez çalışır.
    @BeforeClass: Her bir class'tan önce bir kez çalışır.
    @AfterClass: Her bir class'tan sonra bir kez çalışır.
    @BeforeMethod: Her bir test methodundan önce bir kez çalışır. ==> JUnit'teki @Before
    @AfterMethod: Her bir test methodundan sonra bir kez çalışır. ==> JUnit'teki @After
    --TestNG'de @BeforeGroups, @AfterGroups, @FindBy gibi notasyonlarda vardır. Bunları ileriki konularda göreceğiz.
    --JUnit'te @BeforeClass ve @AfterClass notasyonuna sahip methodlar static olmak ZORUNDAYDI.
    TestNG frameworkunde böyle bir zorunluluk yoktur.

     */



    @Test
    public void test1 (){
        System.out.println("Test1 Çalıştı.");
    }

    @Test
    public void test2 () {
        System.out.println("Test2 Çalıştı.");

    }

    @Test
    public void test3 () {
        System.out.println("Test3 Çalıştı.");

    }

    @Test
    public void test4 () {
        System.out.println("Test4 Çalıştı.");

    }

    @BeforeMethod
    public void setUp() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @BeforeTest
    public void beforeTest (){
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest (){
        System.out.println("After Test");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }

    /*
    Before Suite
    Before Test
    Before Class
    Before Method
    Test1 Çalıştı.
    After Method
    Before Method
    Test2 Çalıştı.
    After Method
    Before Method
    Test3 Çalıştı.
    After Method
    Before Method
    Test4 Çalıştı.
    After Method
    After Class
    After Test
    After Suite
     */
}
