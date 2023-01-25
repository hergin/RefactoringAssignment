public class InsuranceStrategyHigh extends InsuranceStrategy {
    @Override
    public int getAdjustment() {
        return 10000;
    }

    @Override
    public double getWeight() {
        return 0.05;
    }

    @Override
    public int getConstant() {
        return 76500;
    }
}
