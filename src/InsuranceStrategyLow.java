public class InsuranceStrategyLow extends InsuranceStrategy {
    public InsuranceStrategyLow(){}

    @Override
    int getConstant() {
        return 0;
    }

    @Override
    double getWeight() {
        return 0.365;
    }

    @Override
    int getAdjustment() {
        return 0;
    }
}
