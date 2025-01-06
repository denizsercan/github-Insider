package Test;

import Utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class PageLoadTest {

    @Test
    public void checkIfPageLoaded()  {

        Driver.getDriver().get("https://useinsider.com/");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String readyState = js.executeScript("return document.readyState").toString();
        if (readyState.equals("completed")){
            System.out.println("readystate : "+readyState);
        }
        else {
            System.out.println("readystate : "+readyState);
        }
    }
}
