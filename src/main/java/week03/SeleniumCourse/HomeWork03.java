package week03.SeleniumCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class HomeWork03 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\omers\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");

        String userName = driver.findElement(By.xpath("//p[@class='text-center text-white']/b[1]")).getText();
        String password = driver.findElement(By.xpath("//p[@class='text-center text-white']/b[2]")).getText();

        driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//label/span[text()=' User']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

        driver.findElement(By.id("okayBtn")).click();
        WebElement staticDropdown = driver.findElement(By.xpath("//div/select[@class='form-control']"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByValue("teach");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='btn btn-info']")));


        List<WebElement> addButtons = driver.findElements(By.cssSelector("button[class='btn btn-info']"));
        for (WebElement addButton : addButtons) {
            addButton.click();
        }

        driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();
        List<WebElement> purchasedProducts = driver.findElements(By.className("media"));
        Assert.assertEquals(purchasedProducts.size(), addButtons.size());

        driver.quit();
    }
}
