import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsuranceCalculatorTest {

    private double CalculateInsuranceFor(double income) {
        return new InsuranceCalculator().calculateInsurance(income);
    }

    @Test
    public void low() {
        assertEquals(1825, CalculateInsuranceFor(5000), 0.01);
    }

    @Test
    public void medium() {
        assertEquals(38600, CalculateInsuranceFor(25000), 0.01);
    }

    @Test
    public void high() {
        assertEquals(78500, CalculateInsuranceFor(50000), 0.01);
    }

    @Test
    public void veryHigh() {
        assertEquals(106400, CalculateInsuranceFor(100_000), 0.01);
    }

}