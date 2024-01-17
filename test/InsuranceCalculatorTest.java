import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsuranceCalculatorTest {

    @Test
    public void CalculateVeryLowIncome() {
        assertEquals(730, calculateInsurance(2000));
    }
    @Test
    public void CalculateLowIncome() {
        assertEquals(39600, calculateInsurance(30000));
    }
    @Test
    public void CalculateMedIncome() {
        assertEquals(79500, calculateInsurance(60000));
    }

    @Test
    public void CalculateHighIncome() {
        assertEquals(106200, calculateInsurance(90000));
    }
    private double calculateInsurance(double income) {
        return new InsuranceCalculator().calculateInsurance(income);
    }
}