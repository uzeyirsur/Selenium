package week03.SeleniumCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Base2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\omers\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");


        String[] itemsNeeded = {"Cauliflower", "Capsicum", "Pears"};
        addItems(driver, itemsNeeded);
    }

    public static void addItems(WebDriver driver, String[] itemsNeeded) {
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        List itemsNeededList = Arrays.asList(itemsNeeded);


        int j = 0;
        for (int i = 0; i < products.size(); i++) {

            String[] nameOfProduct = products.get(i).getText().split("-");
            String formattedName = nameOfProduct[0].trim();

            if (itemsNeededList.contains(formattedName)) {
                driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
                j++;
                if (j == itemsNeeded.length) {
                    break;
                }
            }
        }

    }
}
