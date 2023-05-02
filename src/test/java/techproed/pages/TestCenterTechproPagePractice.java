package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class TestCenterTechproPagePractice {

    public TestCenterTechproPagePractice() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='exampleInputEmail1']")
    public WebElement username1;

    @FindBy(xpath = "//*[@id='exampleInputPassword1']")
    public WebElement password1;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement submit;

    @FindBy(xpath = "//*[@role='alert']")
    public WebElement loggedText;

    @FindBy(xpath = "//*[@class='btn btn-dark']")
    public WebElement logout;

    @FindBy(xpath = "//*[text()='Login Page']")
    public WebElement loginPageText;

}
