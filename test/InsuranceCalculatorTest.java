import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class InsuranceCalculatorTest {
    @Test
    public void lowIncome() {
        assertEquals(1460, calculate(4000));
    }
    @Test
    public void mediumIncome() {
        assertEquals(39600, calculate(30000));
    }
    @Test
    public void highIncome() {
        assertEquals(79050, calculate(55500));
    }
    @Test
    public void veryHighIncome() {
        assertEquals(113600, calculate(100000));
    }
    private double calculate(double income) {
        return new InsuranceCalculator().calculateInsurance(income);
    }
}

