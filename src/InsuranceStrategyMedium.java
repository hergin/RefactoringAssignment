public class InsuranceStrategyMedium extends InsuranceStrategy {
    public InsuranceStrategyMedium() {}
    @Override
    int getConstant() {
        return 35600;
    }

    @Override
    double getWeight() {
        return 0.2;
    }

    @Override
    int getAdjustment() {
        return 10000;
    }
}
