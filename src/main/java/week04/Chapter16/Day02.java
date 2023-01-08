package week04.Chapter16;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day02 {
    @Test(groups = {"Smoke"})
    public void Demo02(){
        System.out.println("Bye");
    }
    @Parameters({"URL"})
    @Test
    public void Demo03(String urlName){
        System.out.println("SecondClass");
        System.out.println("URL: " + urlName);
    }
}
