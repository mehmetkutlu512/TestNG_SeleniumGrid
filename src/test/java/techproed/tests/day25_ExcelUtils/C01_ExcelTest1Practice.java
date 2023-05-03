package techproed.tests.day25_ExcelUtils;

import org.testng.annotations.Test;
import techproed.utilities.ExcelUtils;
import techproed.utilities.ExcelUtilsPractice;

public class C01_ExcelTest1Practice {

    @Test
    public void excelTest1() {

        String path = "src/test/java/resources/mysmoketestdata.xlsx";
        String sayfa = "customer_info";
        ExcelUtilsPractice excelUtilsPractice = new ExcelUtilsPractice(path,sayfa);
        System.out.println(excelUtilsPractice.getCellData1(1, 0));

//        String path = "src/test/java/resources/mysmoketestdata.xlsx";
//        String sayfa = "customer_info";
//        ExcelUtils excelUtils = new ExcelUtils(path,sayfa);
//        System.out.println(excelUtils.getCellData(1, 0));


    }
}
