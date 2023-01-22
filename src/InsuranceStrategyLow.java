public class InsuranceStrategyLow extends InsuranceStrategy {
    @Override
    public int getConstant() {
        return 0;
    }

    @Override
    public double getWeight() {
        return .365;
    }

    @Override
    public int getAdjustment() {
        return 0;
    }
}
