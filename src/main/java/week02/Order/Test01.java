package week02.Order;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

//Calculating Total
public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = login();


        List<WebElement> selects = driver.findElements(By.xpath("//select/option"));

        for (int i = 0; i < selects.size(); i++) {
            selects.get(i).click();

            driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).clear();
            driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("9");
            int quantity = Integer.parseInt(driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).getAttribute("value"));
            int pricePerUnit = Integer.parseInt(driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtUnitPrice")).getAttribute("value"));


            driver.findElement(By.cssSelector("input[type='submit']")).click();


            Assert.assertEquals(driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtTotal")).getAttribute("value"),
                    (quantity * pricePerUnit) + "");
        }

        driver.quit();

    }

    public static WebDriver login() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\omers\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/" +
                "WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        driver.findElement(By.cssSelector("a[href='Process.aspx']")).click();
        return driver;
    }
}
