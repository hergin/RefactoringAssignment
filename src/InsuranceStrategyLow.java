public class InsuranceStrategyLow extends InsuranceStrategy {
    @Override
    boolean incomeWithinTolerance(double income) {
        return income <= 10000;
    }

    @Override
    int getConstant() {
        return 0;
    }

    @Override
    double getWeight() {
        return 0.365;
    }

    @Override
    int getAdjustment() {
        return 0;
    }
}
