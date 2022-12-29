package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo01 {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\omers\\OneDrive\\Masaüstü\\chromedriver_win32");
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Java");


    }
}
