package week02.Order;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Test05 {
    public static void main(String[] args) {
        WebDriver driver = Test01.login();

        driver.findElement(By.id("ctl00_logout")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector("label[for='ctl00_MainContent_username']")).
                getText(), "Username:");

        driver.quit();
    }
}
