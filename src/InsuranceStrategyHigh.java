public class InsuranceStrategyHigh extends InsuranceStrategy {
    @Override
    public int getConstant() {
        return 78500;
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public int getAdjustment() {
        return 50000;
    }
}
