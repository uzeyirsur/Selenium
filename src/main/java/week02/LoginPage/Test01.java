package week02.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\omers\\Documents\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders" +
                "/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");

        driver.findElement(By.cssSelector("input[name='ctl00$MainContent$username']")).sendKeys("uzeyirsur");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("loyloy");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Assert.assertEquals(driver.findElement(By.id("ctl00_MainContent_status")).getText(),"Invalid Login or Password.");
        driver.quit();
    }
}
