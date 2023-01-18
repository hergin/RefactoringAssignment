import static org.junit.Assert.*;
import org.junit.Test;

public class InsuranceCalculatorTest {
    @Test
    public void IncomeLessThanEqualToTenThousand() {
        assertEquals(10.95, calculateInsurance(30), 0.01);
    }

    @Test
    public void IncomeLessThanEqualToThirtyThousand() {
        assertEquals(35600.2, calculateInsurance(10001), 0.01);
    }

    @Test
    public void IncomeLessThanEqualToSixtyThousand() {
        assertEquals(76500.1, calculateInsurance(30001), 0.01);
    }

    @Test
    public void IncomeElse() {
        assertEquals(105600.02, calculateInsurance(60001), 0.01);
    }

    private double calculateInsurance(double income) {
        return new InsuranceCalculator().calculateInsurance(income);
    }
}