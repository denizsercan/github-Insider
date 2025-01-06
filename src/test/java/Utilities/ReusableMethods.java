package Utilities;

import org.openqa.selenium.By;

public class ReusableMethods {

    public static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.out.println(" " + e.getMessage());
        }
    }

    public static void AcceptCookies() {
        Driver.getDriver().findElement(By.xpath("//*[@id=\"wt-cli-accept-all-btn\"]")).click();
    }
}
