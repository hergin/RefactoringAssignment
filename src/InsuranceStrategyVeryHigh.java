public class InsuranceStrategyVeryHigh extends InsuranceStrategy {
    public InsuranceStrategyVeryHigh() {
    }

    @Override
    boolean incomeWithinTolerance(double income) {
        return income > 60000;
    }

    @Override
    int getConstant() {
        return 105600;
    }

    @Override
    double getWeight() {
        return 0.02;
    }

    @Override
    int getAdjustment() {
        return 60000;
    }
}