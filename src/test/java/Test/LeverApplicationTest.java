package Test;
import Utilities.Driver;
import Utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.InsiderQaPage;



public class LeverApplicationTest {
    InsiderQaPage page = new InsiderQaPage();

    @Test
    public void ClickViewRoleBtn() {
        QADropdownsTest tst = new QADropdownsTest();
        tst.PickDropDownElem();

        ReusableMethods.sleep(5000);

        WebElement ele = Driver.getDriver().findElement(By.xpath("//body/section[@id='career-position-list']/div[@class='container']/div[@class='row']/div[@id='jobs-list']/div[1]/div[1]"));
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(ele).perform();

        ReusableMethods.sleep(2000);

        page.ViewRoleBtn.click();


    }
}



