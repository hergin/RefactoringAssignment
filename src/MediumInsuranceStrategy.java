public class MediumInsuranceStrategy extends InsuranceStrategy {
    public MediumInsuranceStrategy() {
    }

    @Override
    public int getConstant() {
        return 35600;
    }

    @Override
    public double getWeight() {
        return 0.2;
    }

    @Override
    public int getAdjustment() {
        return 10000;
    }
}