public class InsuranceStrategyHigh extends InsuranceStrategy {
    public InsuranceStrategyHigh() { }
    @Override
    public int getConstant() { return 70000; }

    @Override
    public double getWeight() { return 0.18; }

    @Override
    public int getAdjustment() {
        return 25000;
    }
}
