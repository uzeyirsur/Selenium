package week04.Chapter16;

import org.testng.annotations.Test;

public class Day03 {
    @Test(dependsOnMethods = {"APIloginCarLoan"})
    public void webLoginCarLoan(){
        System.out.println("weblogincar");
    }
    @Test(groups = {"Smoke"})
    public void mobileLoginCarLoan(){
        System.out.println("MobileLoginCarLoan");
    }
    @Test(timeOut = 4000)
    public void APIloginCarLoan(){
        System.out.println("LoginAPICarLoan");
    }
}
