package Test;
import Utilities.Driver;
import Utilities.ReusableMethods;
import org.testng.annotations.Test;
import pages.InsiderQaPage;

public class QADropdownsTest {

    InsiderQaPage page = new InsiderQaPage();

    @Test
    public void PickDropDownElem()  {
        Driver.getDriver().navigate().to("https://useinsider.com/careers/quality-assurance/");
        ReusableMethods cookies = new ReusableMethods();
        cookies.AcceptCookies();

        page.AllQaBtn.click();
        ReusableMethods.sleep(3000);
        page.LocationDropDown.click();
        ReusableMethods.sleep(2000);
        page.LocationCrossBtn.click();
        ReusableMethods.sleep(2000);
        page.IstanbulTurkey.click();
        ReusableMethods.sleep(2000);
        page.DepartmentDropDown.click();
        ReusableMethods.sleep(2000);
        page.QualityAssurance.click();

    }
}
