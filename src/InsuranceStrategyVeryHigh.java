public class InsuranceStrategyVeryHigh extends InsuranceStrategy {
    public InsuranceStrategyVeryHigh() {
    }

    @Override
    protected int getConstant() {
        return 105600;
    }

    @Override
    protected double getWeight() {
        return 0.02;
    }

    @Override
    protected int getAdjustment() {
        return 60000;
    }
}