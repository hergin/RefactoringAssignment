import org.junit.Test;

    import static org.junit.Assert.*;
    public class InsuranceTest {
        @Test
        public void low() {
            assertEquals(30000, insuranceFor(5000), 0.01);
        }

        @Test
        public void medium() {
            assertEquals(38600, insuranceFor(25000), 0.01);
        }

        @Test
        public void high() {
            assertEquals(74500, insuranceFor(50000), 0.01);
        }

        @Test
        public void veryHigh() {
            assertEquals(106400, insuranceFor(100_000), 0.01);
        }

        private double insuranceFor(double income) {
            return new InsuranceCalculator().calculateInsurance(income);
        }

}
