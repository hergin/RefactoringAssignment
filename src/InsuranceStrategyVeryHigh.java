public class InsuranceStrategyVeryHigh extends InsuranceStrategy {
    public InsuranceStrategyVeryHigh() {
    }
    int getConstant() {
        return 105600;
    }

    double getWeight() {
        return 0.02;
    }
    int getAdjustment() {
        return 60000;
    }
}