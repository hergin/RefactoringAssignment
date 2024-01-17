public class InsuranceCalculator {
    InsuranceStrategy[] strategies = new InsuranceStrategy[]{
            new InsuranceStrategyLow(),
            new InsuranceStrategyMedium(),
            new InsuranceStrategyHigh(),
            new InsuranceStrategyVeryHigh(),
    };

    public double calculateInsurance(double income) {
        double result = 0.0;

        for (InsuranceStrategy strategy : strategies) {
            result += strategy.calculate(income);
        }

        return result;
    }
}
