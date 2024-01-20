package ifs;

public class InsuranceCalculator {

    InsuranceStrategyVeryHigh strategyVeryHigh;
    public double calculateInsurance(double income) {
        if (income <= 10000) {
            return income*0.365;
        } else if (income <= 30000) {
            return (income-10000)*0.2+35600;
        } else if (income <= 60000) {
            return (income-30000)*0.1+76500;
        } else {
            strategyVeryHigh = new InsuranceStrategyVeryHigh();
            return strategyVeryHigh.calculateInsurance(income);
        }
    }
}
