/*
1-Print the number of the rows and the columns
2-Print the second row of the data
 */
package week03.SeleniumCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeWork07 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\omers\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // number of the rows
        int numberOfRows = driver.findElements(By.cssSelector("#product tbody:nth-child(1) tr")).size();

        //number of the columns
        int numberOfColumns = driver.findElements(By.cssSelector("#product tbody:nth-child(1) tr:nth-child(2) td")).size();

        //Second row of the table
        String secondRow = driver.findElement(By.cssSelector("#product tbody:nth-child(1) tr:nth-child(3)")).getText();

        //Print All
        System.out.println("Number Of Rows: " + numberOfRows
                + "\nNumber Of Columns: " + numberOfColumns
                + "\nSecond Row: " + secondRow);

        driver.quit();
    }
}
