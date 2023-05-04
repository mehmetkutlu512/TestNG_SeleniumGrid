package techproed.utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtilsPractice {
    @DataProvider
    public Object[][] takimListesi() {
        return new Object[][]{{"GS", "Icardi"},{"FB", "Valencia"},{"BJK", "Aboubakar"}};
    }
}
