package week04.Chapter15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WebTableSorting_117 {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\omers\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        driver.findElement(By.cssSelector("th[aria-label*='Veg/fruit name']")).click();
        List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));

        List<String> originalList = elementList.stream().map(s -> s.getText()).collect(Collectors.toList());
        List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
        Assert.assertEquals(sortedList, originalList);


        //Video 118 Find a certain veg's price

        List<String> price = elementList.stream().filter(s -> s.getText().contains("Beans")).map(s -> getPriceOfVeggie(s)).
                collect(Collectors.toList());
        price.forEach(b -> System.out.println(b));


        //Video 119 Find a certain veg's price in different page
        List<String> price1;
        do {
          List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
            price1 = rows.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPriceOfVeggie(s)).collect(Collectors.toList());

            price1.forEach(s -> System.out.println(s));

            if (price1.size() < 1) {
                driver.findElement(By.cssSelector("li a[aria-label='Next']")).click();
            }

        } while (price1.size() < 1);
    }

    private static String getPriceOfVeggie(WebElement s) {
        String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
        return priceValue;
    }
}
