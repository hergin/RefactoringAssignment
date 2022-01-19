public class InsuranceCalculator {

    private InsuranceStrategy strategy;

    public double calculateInsurance(double income) {
        if (income <= 10000) {
            strategy = new InsuranceStrategyLow();
            return strategy.calculateInsuranceVeryHigh(income);
        } else if (income <= 30000) {
            strategy = new InsuranceStrategyMedium();
            return strategy.calculateInsuranceHigh(income);
        } else if (income <= 60000) {
            strategy = new InsuranceStrategyHigh();
              return strategy.calculateInsuranceMedium(income);
        } else {
            strategy = new InsuranceStrategyVeryHigh();
              return strategy.calculateInsuranceLow(income);
        }

    }

}
