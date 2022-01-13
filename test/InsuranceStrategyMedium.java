public class InsuranceStrategyMedium extends InsuranceStrategy {
    @Override
    protected int getConstant() {
        return 35600;
    }

    @Override
    protected double getWeight() {
        return 0.2;
    }

    @Override
    protected int getAdjustment() {
        return 10000;
    }
}
