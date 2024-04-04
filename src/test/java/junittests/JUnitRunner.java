package junittests;

import classes.Calculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class JUnitRunner {
    Calculator calculator = new Calculator();

    @Test
    public void checkAddMethod() {
        assertEquals(33, calculator.add(20, 13));
    }

    @Test
    public void checkSubtractMethod() {
        assertEquals(40, calculator.subtract(45,5));
    }

    @Test
    public void checkMultiplyMethod() {
        assertEquals(60, calculator.multiply(5,12));
    }

    @Test
    public void checkDivideMethod() {
        assertEquals(6, calculator.divide(18,3));
//        assertEquals(6, calculator.divide(18,0));
    }

}
