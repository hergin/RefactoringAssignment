public class InsuranceCalculator {

    public double calculateInsurance(double income) {
        return (income <= 10000) ? new InsuranceStrategyLow().calculate(income)
                : (income <= 30000) ? new InsuranceStrategyMedium().calculate(income)
                : (income <= 60000) ? new InsuranceStrategyHigh().calculate(income)
                : new InsuranceStrategyVeryHigh().calculate(income);
    }
}
