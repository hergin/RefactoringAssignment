public class InsuranceStrategyLow extends calculate {
    @Override
    public int getConstant() {
        return 1825;
    }

    @Override
    public double getWeight() {
        return 0.05;
    }

    @Override
    public int getAdjustment() {
        return 5000;
    }
}
