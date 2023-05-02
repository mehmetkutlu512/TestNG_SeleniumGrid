package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class BlueRentalPagePractice {

    public BlueRentalPagePractice() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a)[1]")
    public WebElement login1;

    @FindBy(xpath = "//*[@id='formBasicEmail']")
    public WebElement email1;

    @FindBy(xpath = "//*[@id='formBasicPassword']")
    public WebElement password1;

    @FindBy(id = "dropdown-basic-button")
    public WebElement verify;

    @FindBy(xpath = "//*[@role='alert']")
    public WebElement hataMesaji1;
}
