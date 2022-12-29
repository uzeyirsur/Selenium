package Exercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {
    public static void main(String[] args) {
       //System.setProperty("webdriver.chorome.driver","C:\\Users\\omers\\Documents\\chromedriver.exe");
     //  WebDriver driver = new ChromeDriver();

        //Firefox Launch
       System.setProperty("webdriver.gecko.driver","C:\\Users\\omers\\Documents\\geckodriver.exe");
       WebDriver driver = new FirefoxDriver();


        //Edge Launch
      //  System.setProperty("webdriver.msedge.driver","C:\\Users\\omers\\Documents\\msedgedriver.exe");
        //WebDriver driver = new EdgeDriver();
        driver.get("https://www.youtube.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();

    }
}
