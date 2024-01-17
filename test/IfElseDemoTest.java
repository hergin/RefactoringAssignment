import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IfElseDemoTest {

    @Test

    public void low() {
        assertEquals(1825, insuranceFor(5000, new InsuranceStrategyLow()), 0.01);
    }

    @Test

    public void medium() {
        assertEquals(38600, insuranceFor(25000, new InsuranceStrategyMedium()), 0.01);
    }

    @Test

    public void high() {
        assertEquals(78500, insuranceFor(50000, new InsuranceStrategyHigh()), 0.01);
    }

    @Test

    public void veryHigh() {
        assertEquals(106400, insuranceFor(100_000, new InsuranceStrategyVeryHigh()), 0.01);
    }

    private double insuranceFor(double income, InsuranceStrategy strat){
        return new InsuranceCalculator().calculateInsurance(income,strat);
    }
}
