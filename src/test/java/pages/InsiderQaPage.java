package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsiderQaPage {
    public InsiderQaPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//div[@class='button-group d-flex flex-row']/a")
    public WebElement AllQaBtn;

    @FindBy (xpath = "//span[@class='select2-selection__rendered']")
    public WebElement LocationDropDown;

    @FindBy (xpath = "//span[@data-select2-id='3']")
    public WebElement LocationCrossBtn;

    @FindBy (xpath = "//li[@class='select2-results__option'][1]")
    public WebElement IstanbulTurkey;

    @FindBy (xpath = "//span[@data-select2-id='4']")
    public WebElement DepartmentDropDown;

    @FindBy (xpath = "//li[contains(text(),'Quality Assurance')]")
    public WebElement QualityAssurance;

    @FindBy (xpath = "//section[@id='career-position-list']//div[@class='row']//div[1]//div[1]//a[1]")
    public WebElement ViewRoleBtn;



}
