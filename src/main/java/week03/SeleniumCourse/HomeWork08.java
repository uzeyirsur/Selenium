package week03.SeleniumCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeWork08 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\omers\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement editBox = driver.findElement(By.id("autocomplete"));
        editBox.sendKeys("unit");

        Thread.sleep(3000);

        editBox.sendKeys(Keys.DOWN);
        editBox.sendKeys(Keys.DOWN);
        System.out.println(editBox.getAttribute("value"));


        driver.quit();
    }

}
