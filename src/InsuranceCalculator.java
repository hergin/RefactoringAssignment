public class InsuranceCalculator {

    private InsuranceStrategy strategy;

    public double calculateInsurance(double income) {
        if (income <= 10000) {
            strategy = new LowInsuranceStrategy();
            return strategy.calculate(income);
        } else if (income <= 30000) {
            strategy = new MediumInsuranceStrategy();
            return strategy.calculate(income);
        } else if (income <= 60000) {
            strategy = new HighInsuranceStrategy();
            return strategy.calculate(income);
        } else {
            strategy = new VeryHighInsuranceStrategy();
            return strategy.calculate(income);
        }
    }
}
