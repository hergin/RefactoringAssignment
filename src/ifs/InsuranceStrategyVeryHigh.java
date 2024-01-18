package ifs;

public class InsuranceStrategyVeryHigh extends InsuranceStrategy {
    private final InsuranceCalculator insuranceCalculator;

    public InsuranceStrategyVeryHigh(InsuranceCalculator insuranceCalculator) {
        this.insuranceCalculator = insuranceCalculator;
    }

}