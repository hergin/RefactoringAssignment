package ifs;
public class InsuranceCalculator {

    private InsuranceStrategyVeryHigh strategy;

    public double calculateInsurance(double income) {

        if (income <= 10000) {
            strategy = new InsuranceStrategyVeryHigh();
            return strategy.calculate(income);
        } else if (income <= 30000) {
            strategy = new InsuranceStrategyVeryHigh();
            return strategy.calculate(income);
        } else if (income <= 60000) {
            strategy = new InsuranceStrategyVeryHigh();
            return strategy.calculate(income);
        } else {
            strategy = new InsuranceStrategyVeryHigh();
            return strategy.calculate(income);
        }

    }
}