import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsuranceCalculatorTest {
    private static final double DELTA = 0.01;
    private final InsuranceCalculator insuranceCalculator = new InsuranceCalculator();

    @Test
    public void testCalculateInsurance_lowIncome() {
        assertEquals(1825, insuranceCalculator.calculateInsurance(5000), DELTA);
    }

    @Test
    public void testCalculateInsurance_mediumIncome() {
        assertEquals(38600, insuranceCalculator.calculateInsurance(25000), DELTA);
    }

    @Test
    public void testCalculateInsurance_highIncome() {
        assertEquals(78500, insuranceCalculator.calculateInsurance(50000), DELTA);
    }

    @Test
    public void testCalculateInsurance_veryHighIncome() {
        assertEquals(106400, insuranceCalculator.calculateInsurance(100_000), DELTA);
    }
}
