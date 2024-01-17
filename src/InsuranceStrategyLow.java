public class InsuranceStrategyLow extends InsuranceStrategy {
    public InsuranceStrategyLow() {}

    @Override
    int getConstant() {
        return 30000;
    }

    @Override
    double getWeight() {
        return 0.36;
    }

    @Override
    int getAdjustment() {
        return 5000;
    }
}
