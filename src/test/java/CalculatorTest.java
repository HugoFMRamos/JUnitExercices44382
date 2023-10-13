import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int sum = calculator.addValues(2, 5);
        int testSum = 7;
        assertEquals(sum, testSum, "Error in addValues method!");
    }
}
