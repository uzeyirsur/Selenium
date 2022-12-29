package week02.ListofAllOrders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Test02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\omers\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/" +
                "WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");

        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.id("ctl00_MainContent_btnCheckAll")).click();
        driver.findElement(By.id("ctl00_MainContent_btnUncheckAll")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[name='ctl00$MainContent$btnDelete']")).click();

        Assert.assertEquals(driver.findElement(By.id("ctl00_MainContent_orderMessage")).getText(), "List of orders is empty. " +
                "In order to add new order use this link.");
        System.out.println("Test failed");
        driver.quit();

    }
}
