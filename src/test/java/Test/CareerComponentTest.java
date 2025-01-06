package Test;

import Utilities.Driver;
import Utilities.ReusableMethods;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.InsiderCareerPage;

public class CareerComponentTest {
    InsiderCareerPage page = new InsiderCareerPage();

    @Test
    public void CareerComponentCheck(){
        Driver.getDriver().navigate().to("https://useinsider.com/careers/");
        ReusableMethods cookies = new ReusableMethods();
        cookies.AcceptCookies();

        for(WebElement element : page.Components){
            if (element.isDisplayed()) {
                if (element.isDisplayed()){
                    System.out.println("Element is visible on the page : " + element.getText());
                } else {
                    System.out.println("Element is not visible on the page : "+ element.getText());
                }
            }
        }

    }
}
