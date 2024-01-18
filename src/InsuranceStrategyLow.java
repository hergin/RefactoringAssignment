public class InsuranceStrategyLow extends InsuranceStrategy {
    public InsuranceStrategyLow() { }

    @Override
    public int getConstant() { return 30000; }

    @Override
    public double getWeight() {
        return 0.36;
    }

    @Override
    public int getAdjustment() {
        return 5000;
    }
}
