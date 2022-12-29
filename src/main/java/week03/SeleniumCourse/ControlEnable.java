package week03.SeleniumCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class ControlEnable {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\omers\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.spicejet.com/");

        WebElement selectDateBox = driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']"));

        System.out.println(selectDateBox.getAttribute("style").contains("background-color"));

        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/" +
                "div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div")).click();

        System.out.println(selectDateBox.getAttribute("style").contains("background-color"));

        if(selectDateBox.getAttribute("style").contains("background-color")){
            System.out.println("It is enabled");
            Assert.assertTrue(true);
        }else{
        Assert.assertTrue(false);
        }

        driver.quit();
    }
}
