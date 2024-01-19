public class InsuranceStrategyMedium extends calculate {
    @Override
    public int getConstant() {
        return 38600;
    }

    @Override
    public double getWeight() {
        return 0.035;
    }

    @Override
    public int getAdjustment() {
        return 25000;
    }
}
