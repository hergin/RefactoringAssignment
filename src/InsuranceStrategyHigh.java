public class InsuranceStrategyHigh extends InsuranceStrategy {
    public InsuranceStrategyHigh() {}
    @Override
    int getConstant() {
        return 70000;
    }

    @Override
    double getWeight() {
        return 0.18;
    }

    @Override
    int getAdjustment() {
        return 25000;
    }
}
