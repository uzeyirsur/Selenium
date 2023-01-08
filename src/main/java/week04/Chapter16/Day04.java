package week04.Chapter16;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day04 {
    @Test
    public void webLoginHouseLoan() {
        System.out.println("Web Login House Loan");
    }

    @Test
    public void mobileLoginHouseLoan() {
        System.out.println("Mobile Login House Loan");
    }

    @Test(dataProvider = "getData")
    public void APILoginHouseLoan(String userName,String password) {
        System.out.println("API Login House Loan");
        System.out.println(userName);
        System.out.println(password);

    }

    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[3][2];
        data[0][0] = "firstSetUsername";
        data[0][1] = "firstPassword";

        data[1][0] = "secondSetUsername";
        data[1][1] = "secondPassword";

        data[2][0] = "thirdSetUsername";
        data[2][1] = "thirdPassword";
        return data;
    }
}
