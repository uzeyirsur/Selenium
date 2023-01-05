package week02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\omers\\OneDrive\\Masaüstü\\chromedriver_win32");
        driver.get("https://tr.wikipedia.org/wiki/Anasayfa");
        String str = driver.getCurrentUrl();
        System.out.println("Test1:" + (str));
        String pageSource = driver.getPageSource();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@class='vector-search-box-input']")).sendKeys("William Shakespeare");
        Thread.sleep(2000);


        Thread.sleep(2000);

        System.out.println(pageSource);
        System.out.println("title of page: " + driver.getTitle());
        driver.close();


    }
}
