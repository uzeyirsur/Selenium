package week04.Chapter16;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listeners implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("I failed");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("I executed successfully");
    }
}
