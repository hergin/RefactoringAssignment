public class InsuranceStrategyLow extends InsuranceStrategy {
    public InsuranceStrategyLow() {
    }

    @Override
    public double getWeight() {
        return 0.365;
    }

    @Override
    public int getConstant() {
        return 0;
    }

    @Override
    public int getAdjustment() {
        return 0;
    }
}
