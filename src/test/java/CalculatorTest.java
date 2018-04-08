import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
    private static ICalculator calculator;

    @BeforeClass
    public static void initCalculator() {
        calculator = new Calculator();

    }

    @Test
    public void testSum() {
        int result = calculator.sum(3, 4);
        assertEquals(7, result);
    }
}
