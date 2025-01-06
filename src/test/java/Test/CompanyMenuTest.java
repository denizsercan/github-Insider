package Test;
import Utilities.Driver;
import Utilities.ReusableMethods;
import org.testng.annotations.Test;
import pages.InsiderHomePage;

public class CompanyMenuTest {

    InsiderHomePage page = new InsiderHomePage();

    @Test
    public void CompanyMenuNavigation()  {
        Driver.getDriver().get("https://useinsider.com/");
        ReusableMethods cookies = new ReusableMethods();
        cookies.AcceptCookies();

        page.Company.click() ;
        ReusableMethods.sleep(3000);
        page.Careers.click();

    }
}
