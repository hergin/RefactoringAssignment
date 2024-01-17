public class InsuranceStrategyHighIncome extends InsuranceStrategy {
    public InsuranceStrategyHighIncome() {

    }

    @Override
    public int getConstant() {
        return 105600;
    }

    @Override
    public double getWeight() {
        return 0.02;
    }

    @Override
    public int getAdjustment() {
        return 60000;
    }
}