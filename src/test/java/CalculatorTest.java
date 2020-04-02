import NewLesson.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addTest1() {
        //Given
        Calculator calculator = new Calculator();
        int x = 1;
        int y = 2;

        int expected = 3;

        //When
        int actual = calculator.add(x, y);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void subtractTest2() {
        //Given
        Calculator calculator = new Calculator();
        int a = 3;
        int b = 2;

        int expected = 1;

        //When
        int actual = calculator.subtract(a, b);
        //Then
        Assert.assertEquals(expected, actual);
    }

    // To do multiply, divide and exponents
    @Test
    public void multiplyTest3() {
        //Given
        Calculator calculator = new Calculator();
        int c = 10;
        int d = 2;

        int expected = 20;

        //When
        int actual = calculator.multiply(c, d);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void DivideTest4() {
        //Given
        Calculator calculator = new Calculator();
        int e = 10;
        int f = 2;

        int expected = 5;

        //When
        int actual = calculator.divide(e, f);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void ExponentTest5() {
        Calculator calculator = new Calculator();
        double val1 = 2.0;
        double val2 = 3.0;
        double expected = 8.0;

        double actual = calculator.exponent(val1, val2);
        Assert.assertEquals(expected, actual, delta );
        }
    }
