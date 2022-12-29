package week03.SeleniumCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UpdatedDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\omers\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.spicejet.com/");

        WebElement selectBox = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/" +
                "div[3]/div[2]/div[6]/div/div[2]/div[2]/div/div[2]/div/div/div[1]"));

        System.out.println(selectBox.isSelected());
        Thread.sleep(5000);
        selectBox.click();
        Thread.sleep(3000);
        System.out.println(selectBox.isSelected());

        driver.quit();
    }
}
