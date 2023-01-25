public class InsuranceStrategyLow extends InsuranceStrategy {
    @Override
    public int getAdjustment() {
        return 10000;
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public int getConstant() {
        return 1825;
    }
}
