import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsuranceCalculatorTest {

    @Test
    public void lowBottomEdge() {
        assertEquals(0, insuranceFor(0.01), 0.01);
    }

    @Test
    public void low() {
        assertEquals(1825, insuranceFor(5000), 0.01);
    }

    @Test
    public void lowTopEdge() {
        assertEquals(3650, insuranceFor(10000), 0.01);
    }

    @Test
    public void mediumBottomEdge() {
        assertEquals(35600, insuranceFor(10000.01), 0.01);
    }

    @Test
    public void medium() {
        assertEquals(38600, insuranceFor(25000), 0.01);
    }

    @Test
    public void mediumTopEdge() {
        assertEquals(39600, insuranceFor(30000), 0.01);
    }

    @Test
    public void highBottomEdge() {
        assertEquals(76500, insuranceFor(30000.01), 0.01);
    }

    @Test
    public void high() {
        assertEquals(78500, insuranceFor(50000), 0.01);
    }

    @Test
    public void highTopEdge() {
        assertEquals(79500, insuranceFor(60000), 0.01);
    }

    @Test
    public void veryHighBottomEdge() {
        assertEquals(105600, insuranceFor(60000.01), 0.01);
    }

    @Test
    public void veryHigh() {
        assertEquals(106400, insuranceFor(100_000), 0.01);
    }

    @Test
    public void veryHighTopEdge() {
        assertEquals(107400, insuranceFor(150_000), 0.01);
    }

    private double insuranceFor(double income) {
        return new InsuranceCalculator().calculateInsurance(income);
    }
}