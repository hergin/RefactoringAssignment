public class InsuranceStrategyVeryHigh extends InsuranceStrategy {

    @Override
    public int getConstant() {
        return 105600;
    }

    @Override
    public double getWeight() {
        return 0.2;
    }

    @Override
    public int getAdjustment() {
        return 60000;
    }

}