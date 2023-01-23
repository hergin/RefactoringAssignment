import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InsuranceCalculatorTest {

    @Test
    public void low(){
        Assertions.assertEquals(1825, insuranceFor(5000));
    }
    @Test
    public void medium(){
        Assertions.assertEquals(38600, insuranceFor(25000));
    }
    @Test
    public void high(){
        Assertions.assertEquals(78500, insuranceFor(50000));
    }
    @Test void veryHigh(){
        Assertions.assertEquals(106400, insuranceFor(100000));
    }

    private double insuranceFor(double income){
        return InsuranceCalculator.calculateInsurance(income);
    }
}