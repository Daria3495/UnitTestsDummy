package testng;

import classes.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNgRunner {

    Calculator calculator = new Calculator();

    @Test
    public void verifyAddMethod() {

        Assert.assertEquals(calculator.add(2, 3), 5);

    }

    @Test
    public void verifySubtractMethod() {

        Assert.assertEquals(calculator.subtract(12, 9), 3);

    }

    @Test
    public void verifyMultiplyMethod() {

        Assert.assertEquals(calculator.multiply(7, 15), 105);

    }

    @Test
    public void verifyDivideMethod() {

        Assert.assertEquals(calculator.divide(90, 9), 10);

    }

}
