package week03.SeleniumCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckBoxExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\omers\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

       List<WebElement> options = driver.findElements(By.cssSelector("input[type=checkbox]"));

       for(WebElement option: options){
           option.click();
           Assert.assertTrue(option.isSelected());

           option.click();
           Assert.assertFalse(option.isSelected());
       }

       driver.quit();
        System.out.println("Number of checkboxes: " + options.size());
    }

}
