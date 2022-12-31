package week03.Products;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class AddToChart {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\omers\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        List<WebElement> addToChartButtons = driver.findElements(By.cssSelector("button[class='btn btn_primary btn_small btn_inventory']"));

        for (int i = 0; i < addToChartButtons.size(); i++) {
            addToChartButtons.get(i).click();
            Assert.assertEquals(driver.findElement(By.xpath("//a/span")).getText(), (i + 1) + "");
        }

        driver.quit();
    }
}
