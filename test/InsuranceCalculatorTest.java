import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsuranceCalculatorTest {
    @Test
    public void lowIncome() {
        assertEquals(1825, insuranceFor(5000), 0.01);
    }

    @Test
    public void mediumIncome() {
        assertEquals(38600, insuranceFor(25000), 0.01);
    }

    @Test
    public void highIncome() {
        assertEquals(78500, insuranceFor(50000), 0.01);
    }

    @Test
    public void veryHighIncome() {
        assertEquals(106400, insuranceFor(100000), 0.01);
    }

    private double insuranceFor(double income) {
        return new InsuranceCalculator().calculateInsurance(income);
    }

}