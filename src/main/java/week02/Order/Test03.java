package week02.Order;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

//New Order
public class Test03 {
    public static void main(String[] args) {
        WebDriver driver = Test01.login();
        driver.findElement(By.xpath("//select/option[@value='FamilyAlbum']")).click();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("1");
        List<WebElement> infos = driver.findElements(By.xpath("//ol[2]/li/input"));

        for (WebElement info : infos) {
            info.sendKeys("abcdf");
        }
        infos.get(infos.size() - 1).clear();
        infos.get(infos.size() - 1).sendKeys("121212");

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("1231232131231231233");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("26/12");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//strong")).getText(), "New order has been successfully added.");

        driver.quit();
    }
}
