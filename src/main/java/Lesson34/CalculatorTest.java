package Lesson34;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {

    @Test
    public void testPlus() {
        Calculator calculator = new Calculator();
        int result = calculator.plus(3, 7);
        assertEquals(10, result);
    }

    @Test
    public void testMinus() {
        Calculator calculator = new Calculator();
        int result = calculator.minus(7, 3);
        assertEquals(4, result);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(3, 4);
        assertEquals(12, result);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(8, 4);
        assertEquals(2, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        calculator.divide(8, 0);
    }

    @Test
    public void testDivideByNonZero() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(10, 2);
        assertEquals(5, result);
    }

    @Test
    public void testDivideNegativeNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(-10, -2);
        assertEquals(5, result);
    }

    @Test
    public void testDivideNegativeByPositive() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(-10, 2);
        assertEquals(-5, result);
    }

    @Test
    public void testDivideZeroByNonZero() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(0, 5);
        assertEquals(0, result);
    }
}
