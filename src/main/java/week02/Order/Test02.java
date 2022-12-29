package week02.Order;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static week02.Order.Test01.login;

//Calculating total with discount
public class Test02 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = login();

        List<WebElement> selects = driver.findElements(By.xpath("//select/option"));

        int discount = 0;
        for (int i = 0; i < selects.size(); i++) {
            selects.get(i).click();

            driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).clear();
            driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("10");
            driver.findElement(By.cssSelector("input[type='submit']")).click();

            int quantity = Integer.parseInt(driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).getAttribute("value"));
            int pricePerUnit = Integer.parseInt(driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtUnitPrice")).getAttribute("value"));
            discount = Integer.parseInt(driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtDiscount")).getAttribute("value"));

            Assert.assertEquals(driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtTotal")).getAttribute("value"),
                    ((quantity * pricePerUnit) - (((quantity * pricePerUnit) / 100) * discount)) + "");
        }
        driver.quit();

    }
}
