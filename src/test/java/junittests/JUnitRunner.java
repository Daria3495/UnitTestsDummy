package junittests;

import classes.Calculator;
import classes.EvenOddChecker;
import classes.Rectangle;
import org.junit.Test;


import static org.junit.Assert.*;


public class JUnitRunner {
    Calculator calculator = new Calculator();
    EvenOddChecker evenOddChecker = new EvenOddChecker();

    double length = 2;

    double width = 10;
    Rectangle rectangle = new Rectangle(length, width);


    @Test
    public void checkAddMethod() {
        assertEquals("The ADD method returned incorrect SUM", 33, calculator.add(20, 13));
    }

    @Test
    public void checkSubtractMethod() {
        assertEquals("The SUBTRACT method returned incorrect SUM", 40, calculator.subtract(45, 5));
    }

    @Test
    public void checkMultiplyMethod() {
        assertEquals("The MULTIPLY method returned incorrect SUM", 60, calculator.multiply(5, 12));
    }

    @Test
    public void checkDivideMethod() {
        assertEquals("The DIVIDE method returned incorrect SUM", 6, calculator.divide(18, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void dividingByZero() {
        assertEquals("Dividing by zero does not returned error", calculator.divide(7, 0));
    }

    @Test
    public void checkDivisionWithoutRemainder() {
        assertTrue("The number divided with reminder, expected EVEN", evenOddChecker.check(8));
    }

    @Test
    public void checkDivisionWithRemainder() {
        assertFalse("The number divided without reminder, expected ODD", evenOddChecker.check(9));
    }

    @Test
    public void checkObjectConstructor() {
        assertEquals("Length is not the same as in object", length, rectangle.getLength(), 0.001);
        assertEquals("Width is not the same as in object", width, rectangle.getWidth(), 0.001);
    }

    @Test
    public void checkSettingNewLength() {

        double newLength = 7.0;

        rectangle.setLength(newLength);
        assertEquals("Length is not set with new parameter", newLength, rectangle.getLength(), 0.001);
    }

    @Test
    public void checkSettingNewWidth() {

        double newWidth = 5.0;

        rectangle.setWidth(newWidth);
        assertEquals("Width is not set with new parameter", newWidth, rectangle.getWidth(), 0.001);
    }

    @Test
    public void checkAreaForObject() {
        assertEquals("The area of the rectangle is not as expected", 20.0, rectangle.getArea(), 0.001);
    }

}
