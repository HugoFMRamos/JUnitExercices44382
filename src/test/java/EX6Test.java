import org.example.EX6;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EX6Test {

    static EX6 ex6;
    static int number;
    static int expectedCount;
    static int expectedSum;
    static float expectedAverage;
    int i = 1;
    @BeforeAll
    public static void setUp() {
        ex6 = new EX6();
        number = 165782;
    }

    @Test
    public void testCount() {
        expectedCount = 6;
        int count = ex6.countDigits(number);
        assertEquals(expectedCount, count, "ERROR IN COUNT METHOD!");
    }

    @Test
    public void testSum() {
        expectedSum = 29;
        int sum = ex6.sumDigits(number);
        assertEquals(expectedSum, sum, "ERROR IN SUM METHOD!");
    }

    @Test
    public void testAverage() {
        expectedAverage = (float) expectedSum/expectedCount;
        float average = ex6.average(number);
        assertEquals(expectedAverage, average, "ERROR IN AVERAGE METHOD!");
    }
}
