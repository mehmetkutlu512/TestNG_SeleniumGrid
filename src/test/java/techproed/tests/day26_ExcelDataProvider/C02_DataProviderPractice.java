package techproed.tests.day26_ExcelDataProvider;

import org.testng.annotations.Test;
import techproed.utilities.DataProviderUtilsPractice;

public class C02_DataProviderPractice {

    @Test(dataProvider = "takimListesi", dataProviderClass = DataProviderUtilsPractice.class)
    public void testTakim(String team, String player) {
        System.out.println(team +" -->"+ player);
    }
}
