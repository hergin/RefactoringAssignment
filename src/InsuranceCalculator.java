import static java.lang.Math.*;

public class InsuranceCalculator {

    private final InsuranceStrategy[] strategies;

    public InsuranceCalculator() {
        strategies = new InsuranceStrategy[4];
        strategies[0] = new InsuranceStrategyLow();
        strategies[1] = new InsuranceStrategyMedium();
        strategies[2] = new InsuranceStrategyHigh();
        strategies[3] = new InsuranceStrategyVeryHigh();
    }

    public double calculateInsurance(double income) {
        return decideStrategy(income).calculate(income);
    }

    private InsuranceStrategy decideStrategy(double income) {
        income = max(income, 0);
        // There are other strategies for this, including signum, abs, etc, but this is probably the cleanest way
        // to accomplish the mapping.
        int index = (int)(
                min(ceil(income/10_000)-1, 1)
                + min(ceil(income/30_000)-1, 1)
                + min(ceil(income/60_000)-1, 1)
        );
        return strategies[index];
    }
}
