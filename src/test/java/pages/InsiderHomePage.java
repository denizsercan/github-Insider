package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsiderHomePage {

    public InsiderHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (partialLinkText = "Company")
    public WebElement Company;

    @FindBy (partialLinkText = "Careers")
    public WebElement Careers;
}
