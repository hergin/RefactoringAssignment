import java.lang.Math;

public class InsuranceCalculator {

    private InsuranceStrategy strategy;

    public double calculateInsurance(double income) {
        InsuranceStrategy[] hashBrown = new InsuranceStrategy[6];
        hashBrown[0] = new InsuranceStrategyLow();
        hashBrown[1] = new InsuranceStrategyMedium();
        hashBrown[2] = new InsuranceStrategyMedium();
        hashBrown[3] = new InsuranceStrategyHigh();
        hashBrown[4] = new InsuranceStrategyHigh();
        hashBrown[5] = new InsuranceStrategyHigh();
        int deviousNum = (int)Math.floor(Math.abs(income / 10000 - 0.1));
        try {
            strategy = hashBrown[deviousNum];
            return strategy.calculate(income);
        } catch(ArrayIndexOutOfBoundsException error) {
            strategy = new InsuranceStrategyVeryHigh();
            return strategy.calculate(income);
        }
    }
}
