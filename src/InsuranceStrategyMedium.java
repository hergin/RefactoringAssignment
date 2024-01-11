public class InsuranceStrategyMedium extends InsuranceStrategy {
    @Override
    protected int getConstant() {
        return 35_600;
    }

    @Override
    protected double getWeight() {
        return 0.2;
    }

    @Override
    protected int getAdjustment() {
        return 10_000;
    }
}
