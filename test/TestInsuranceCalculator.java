import org.junit.Assert;
import org.junit.Test;


public class TestInsuranceCalculator{
    @Test
    public void calculateInsurance() {
        Assert.assertNotNull(insuranceFor(30000));
    }

    @Test
    public void testLow() {
        Assert.assertEquals(1825, insuranceFor(5000), 0.01);
    }

    @Test
    public void testMedium() { Assert.assertEquals(38600, insuranceFor(25000), 0.01);
    }

    @Test
    public void testHigh() {
        Assert.assertEquals(78500, insuranceFor(50000), 0.01);
    }

    @Test
    public void testVeryHigh() {
        Assert.assertEquals(106400, insuranceFor(100_000), 0.01);
    }

    private double insuranceFor(double income) {
        return new InsuranceCalculator().calculateInsurance(income);
    }
}