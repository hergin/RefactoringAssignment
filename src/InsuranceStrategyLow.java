public class InsuranceStrategyLow extends InsuranceStrategy {
    @Override
    int getAdjustment() { return 0; }

    @Override
    double getWeight() {
        return 0.365;
    }

    @Override
    int getConstant() {
        return 0;
    }
}
