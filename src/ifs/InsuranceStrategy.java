package ifs;

public class InsuranceStrategy {
    public double calculateInsuranceVeryHigh(double income) {
        return (income - insuranceCalculator.getAdjustment()) * insuranceCalculator.getWeight() + insuranceCalculator.getConstant();
    }
}
