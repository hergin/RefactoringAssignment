public class InsuranceCalculator {

    final InsuranceStrategy[] strategies = {
            new InsuranceStrategyLow(),
            new InsuranceStrategyMedium(),
            new InsuranceStrategyHigh(),
            new InsuranceStrategyVeryHigh()
    };

    int boolToInt(boolean a) {
        return Boolean.compare(a, false);
    }

    public double calculateInsurance(double income) {
        int i = boolToInt(income>10000) + boolToInt(income>30000) + boolToInt(income>60000);
        return strategies[i].calculateInsurance(income);
    }

}
