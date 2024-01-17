import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class InsuranceCalculatorTest {
    @Test
    public void lowIncome() {
        assertEquals(1825, calculate(5000), 0.01);
    }
    @Test
    public void mediumIncome() {
        assertEquals(38600, calculate(25000), 0.01);
    }
    @Test
    public void highIncome() {
        assertEquals(78500, calculate(50000), 0.01);
    }
    @Test
    public void veryHighIncome() {
        assertEquals(113600, calculate(100000), 0.01);
    }
    @Test
    public void veryLowIncome() {
        assertEquals(0.73, calculate(2), 0.01);
    }
    private double calculate(double income) {
        return new InsuranceCalculator().calculateInsurance(income);
    }
}

