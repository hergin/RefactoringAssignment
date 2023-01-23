public class InsuranceStrategyHigh extends InsuranceStrategy{
    public InsuranceStrategyHigh() {
    }

    @Override
    int getAdjustment() {
        return 30000;
    }

    @Override
    double getWeight() {
        return 0.1;
    }

    @Override
    int getConstant() {
        return 76500;
    }
}
