import org.example.AreaCalculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AreaCalculatorTest {

    static AreaCalculator areaCalculator;
    @BeforeAll
    public static void setUp() {
        areaCalculator = new AreaCalculator();
    }

    @Test
    public void testArea() {
        //First Case
        int area1 = areaCalculator.calculateArea(3, 5);
        int expectedArea1 = 15;
        //Second Case
        int area2 = areaCalculator.calculateArea(5, 8);
        int expectedArea2 = 40;
        //Third Case
        int area3 = areaCalculator.calculateArea(2, 4);
        int expectedArea3 = 8;
        assertEquals(expectedArea1, area1, "Error area1!");
        assertEquals(expectedArea2, area2, "Error area2!");
        assertEquals(expectedArea3, area3, "Error area3!");
    }

    @Test
    public void testPerimeter() {
        //First Case
        int per1 = areaCalculator.calculatePerimeter(3, 5);
        int expectedPer1 = 16;
        //Second Case
        int per2 = areaCalculator.calculatePerimeter(5, 8);
        int expectedPer2 = 26;
        //Third Case
        int per3 = areaCalculator.calculatePerimeter(2, 4);
        int expectedPer3 = 12;
        assertEquals(expectedPer1, per1, "Error per1!");
        assertEquals(expectedPer2, per2, "Error per2!");
        assertEquals(expectedPer3, per3, "Error per3!");
    }

    @Test
    public void testTriangles() {
        boolean isTriangle = areaCalculator.isTriangle(3, 20, 5);
        assertFalse(isTriangle);

        boolean isTriangle2 = areaCalculator.isTriangle(6, 6, 6);
        assertTrue(isTriangle2);
    }
}
