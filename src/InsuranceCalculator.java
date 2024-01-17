public class InsuranceCalculator {

    private InsuranceStrategy strategy;

    public double calculateInsurance(double income) {
        if (income <= 10000) {
            strategy = new InsuranceStrategyVeryLowIncome();
            return strategy.calculate(income);
        } else if (income <= 30000) {
            strategy = new InsuranceStrategyLowIncome();
            return strategy.calculate(income);
        } else if (income <= 60000) {
            strategy = new InsuranceStrategyMedIncome();
            return strategy.calculate(income);
        } else {
            strategy = new InsuranceStrategyHighIncome();
            return strategy.calculate(income);
        }
    }

}
