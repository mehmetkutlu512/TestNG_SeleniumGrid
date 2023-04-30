package techproed.tests.day24_Properties_Pages;

import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C02_PageKullanımı {
    @Test
    public void test1() {
        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adrese gidelim
        Driver.getDriver().get(ConfigReader.getProperty("opensource_Url"));
        /*
            Yukardaki adress için 20 adet test methodu oluşturursak sonrasında yukardaki url'de bir değişiklik
        olduğunda bütün test methodlarından tek tek url düzeltmek yerine bir kere .properties dosyamdan
        url'li düzeltirim ve bu bizim için daha hızlı daha düzenli ve daha kolay olur
             */

        //kullaniciAdi, kullaniciSifre, submitButton elementlerini locate edelim
        //Login Testinin basarili oldugunu test et

    }
}
