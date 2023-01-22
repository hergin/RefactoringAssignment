public class InsuranceStrategyVeryHigh {
    private final InsuranceCalculator insuranceCalculator;

    public InsuranceStrategyVeryHigh(InsuranceCalculator insuranceCalculator) {
        this.insuranceCalculator = insuranceCalculator;
    }

    public double calculateInsuranceVeryHigh(double income) {
        return (income - insuranceCalculator.getAdjustment()) *
                insuranceCalculator.getWeight() +
                insuranceCalculator.getConstant();
    }
}