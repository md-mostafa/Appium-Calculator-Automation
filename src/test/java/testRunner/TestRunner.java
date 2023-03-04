package testRunner;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import screens.CalScreen;
import setup.Setup;

public class TestRunner extends Setup {

    @Test(priority = 1, description = "Sum of two numbers")
    public void doSum() {
        CalScreen calScreen = new CalScreen(driver);
        String result = calScreen.doSum();
        System.out.println("Sum = "+result);
        Assert.assertEquals(result, "14", "Sum calculation mismatched");
    }

    @Test(priority = 2, description = "Substraction of two numbers")
    public void doSub() {
        CalScreen calScreen = new CalScreen(driver);
        String result = calScreen.doSub();
        System.out.println("Sum = "+result);
        Assert.assertEquals(result, "5", "Substraction calculation mismatched");
    }

    @Test(priority = 3, description = "Multiplication of two numbers")
    public void doMul(){
        CalScreen calScreen = new CalScreen(driver);
        String result = calScreen.doMul();
        System.out.println("Mul = "+result);
        Assert.assertEquals(result, "70",  "Multiplication calculation mismatched");
    }

    @Test(priority = 4, description = "Division of two numbers")
    public void doDiv(){
        CalScreen calSreen = new CalScreen(driver);
        String result = calSreen.doDiv();
        System.out.println("Div = "+result);
        Assert.assertEquals(result,"7", "Division calculation mismatched");
    }

    @Test(priority = 5, description = "Solving a series")
    public void solveSeries(){
        CalScreen calSreen = new CalScreen(driver);
        String result = calSreen.solveSeries();
        System.out.println("Result = "+result);
        Assert.assertEquals(result, "260", "Ans didnt match");
    }

    @AfterMethod
    public void clearScreen(){
        CalScreen calScreen = new CalScreen(driver);
        calScreen.btnClear.click();
    }
}
