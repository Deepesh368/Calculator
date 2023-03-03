import static org.junit.Assert.*;
import myCalculator.Calculator;
import org.junit.Test;

public class TestCalculator {
    private static final double DELTA = 1e-15;
    Calculator cal = new Calculator();
    @Test
    public void rootTruePositive(){
        assertEquals("Finding square root for True Positive", 6, cal.root(36), DELTA);
        assertEquals("Finding square root for True Positive", 8, cal.root(64), DELTA);
    }
    @Test
    public void rootFalsePositive(){
        assertNotEquals("Finding square root for False Positive", 1, cal.root(5), DELTA);
        assertNotEquals("Finding square root for False Positive", 0, cal.root(6), DELTA);
    }
}
