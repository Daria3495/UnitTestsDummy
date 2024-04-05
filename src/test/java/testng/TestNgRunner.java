package testng;

import classes.Calculator;
import classes.EvenOddChecker;
import classes.Rectangle;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNgRunner {

    Calculator calculator = new Calculator();

    double length = 6;

    double width = 8;
    Rectangle rectangle = new Rectangle(length, width);

    @Test
    public void verifyAddMethod() {
        Assert.assertEquals(calculator.add(2, 3), 5,
                "The ADD method returned incorrect SUM");
    }

    @Test
    public void verifySubtractMethod() {
        Assert.assertEquals(calculator.subtract(12, 9), 3,
                "The SUBTRACT method returned incorrect SUM");
    }

    @Test
    public void verifyMultiplyMethod() {
        Assert.assertEquals(calculator.multiply(7, 15), 105,
                "The MULTIPLY method returned incorrect SUM");
    }

    @Test
    public void verifyDivideMethod() {
        Assert.assertEquals(calculator.divide(90, 9), 10,
                "The DIVIDE method returned incorrect SUM");
    }

    @Test (expectedExceptions = ArithmeticException.class)
    public void dividingByZero() {
        Assert.assertEquals(calculator.divide(8, 0),
                "Dividing by zero does not returned error");
    }

    @Test
    public void checkRemainderOfZeroIsEven() {
        Assert.assertTrue(EvenOddChecker.check(12),
                "The number divided with reminder, expected EVEN");
    }

    @Test
    public void checkRemainderOfZeroIsOdd() {
        Assert.assertFalse(EvenOddChecker.check(13),
                "The number divided without reminder, expected ODD");
    }

    @Test
    public void checkCreationOfRectangle() {
        Assert.assertEquals(rectangle.getWidth(), width,0.001,
                "Width is not the same as in object");
        Assert.assertEquals(rectangle.getLength(), length,0.001,
                "Length is not the same as in object");
    }

    @Test
    public void checkSettingNewLengthToRectangle() {

        double newLength = 13.0;

        rectangle.setLength(newLength);

        Assert.assertEquals(rectangle.getLength(), newLength,0.001,
                "Width is not the same as in object");
    }

    @Test
    public void checkSettingNewWidthToRectangle() {

        double newWidth = 5.0;

        rectangle.setWidth(newWidth);

        Assert.assertEquals(rectangle.getWidth(), newWidth,0.001,
                "Width is not the same as in object");
    }

    @Test
    public void checkAreaForRectangle() {
        Assert.assertEquals(rectangle.getArea(), 48.00, 0.001,
                "The area of the rectangle is not as expected");
    }

}
