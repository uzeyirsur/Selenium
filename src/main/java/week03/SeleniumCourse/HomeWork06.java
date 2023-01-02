package week03.SeleniumCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;

public class HomeWork06 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\omers\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement option = driver.findElement(By.cssSelector("label[for='bmw']"));
        option.findElement(By.id("checkBoxOption1")).click();
        String optionText = option.getText();

        WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByVisibleText(optionText);

        driver.findElement(By.id("name")).sendKeys(optionText);
        driver.findElement(By.id("alertbtn")).click();

        Assert.assertTrue(driver.switchTo().alert().getText().contains(optionText));

        driver.switchTo().alert().accept();

        driver.quit();


    }
}
