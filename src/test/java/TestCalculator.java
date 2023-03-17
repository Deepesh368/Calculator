import static org.junit.Assert.*;
import myCalculator.Calculator;
import org.junit.Test;

public class TestCalculator {
    private static final double DELTA = 1e-15;
    Calculator cal = new Calculator();
    @Test
    public void rootTruePositive(){
        assertEquals( "Finding square root for True Positive", 6, cal.root(36), DELTA);
        assertEquals("Finding square root for True Positive", 8, cal.root(64), DELTA);
    }
    @Test
    public void rootFalsePositive(){
        assertNotEquals("Finding square root for False Positive", 1, cal.root(5), DELTA);
        assertNotEquals("Finding square root for False Positive", 0, cal.root(6), DELTA);
    }

    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial for True Positive", 120, cal.factorial(5), DELTA);
        assertEquals("Finding factorial for True Positive", 40320, cal.factorial(8), DELTA);
    }
    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial for False Positive", 2, cal.factorial(4), DELTA);
        assertNotEquals("Finding factorial for False Positive", 8, cal.factorial(6), DELTA);
    }

    @Test
    public void logarithmTruePositive(){
        assertEquals("Finding logarithm for True Positive", 1.0986122886681098, cal.logarithm(3), DELTA);
        assertEquals("Finding logarithm for True Positive", 1.6094379124341003, cal.logarithm(5), DELTA);
    }
    @Test
    public void logarithmFalsePositive(){
        assertNotEquals("Finding logarithm for False Positive", 1, cal.logarithm(5), DELTA);
        assertNotEquals("Finding logarithm for False Positive", 0, cal.logarithm(6), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Finding power for True Positive", 4, cal.power(2, 2), DELTA);
        assertEquals("Finding power for True Positive", 27, cal.power(3, 3), DELTA);
    }
    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding power for False Positive", 1, cal.power(5, 2), DELTA);
        assertNotEquals("Finding power for False Positive", 0, cal.power(6, 2), DELTA);
    }
}
