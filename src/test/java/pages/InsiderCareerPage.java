package pages;
import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public  class InsiderCareerPage {

    public InsiderCareerPage(){
      
          PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "(//div/h3)[5] | //div[@data-id='21cea83']/div/h2 | //a[@href='javascript:void(0)']")
    public List<WebElement> Components;
}
