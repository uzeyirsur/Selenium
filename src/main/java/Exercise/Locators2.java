package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Locators2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/uzeyirsur");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertEquals(driver.findElement(By.cssSelector("span[class *='p-nickname']")).getText(),"uzeyirsur");
        driver.quit();
    }
}
