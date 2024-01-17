public class InsuranceStrategyVeryHigh extends InsuranceStrategy {
    public double calculateInsuranceVeryHigh(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

}