package week04.Chapter16;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day01 {
    @Test(groups = {"Smoke"})
    public void Demo(){
        System.out.println("Hello");

    }
    @Test
    public void Demo02(){
        System.out.println("Hello2");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println("It will execute after the all methods in this test");
    }
    @BeforeTest
    public void BeforeTest(){
        System.out.println("It will execute before all of the method in this test");
    }
}
