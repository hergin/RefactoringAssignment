public class InsuranceStrategyLow extends InsuranceStrategy {
    @Override
    protected int getConstant() {
        return 0;
    }

    @Override
    protected double getWeight() {
        return 0.365;
    }

    @Override
    protected int getAdjustment() {
        return 0;
    }
}
