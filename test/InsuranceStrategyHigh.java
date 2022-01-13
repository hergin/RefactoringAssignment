public class InsuranceStrategyHigh extends InsuranceStrategy {
    @Override
    protected int getConstant() {
        return 76500;
    }

    @Override
    protected double getWeight() {
        return 0.1;
    }

    @Override
    protected int getAdjustment() {
        return 30000;
    }
}
