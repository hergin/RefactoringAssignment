public class InsuranceStrategyMedium extends InsuranceStrategy {
    @Override
    boolean incomeWithinTolerance(double income) {
        return income > 10000 && income <= 30000;
    }

    @Override
    int getConstant() {
        return 35600;
    }

    @Override
    double getWeight() {
        return 0.2;
    }

    @Override
    int getAdjustment() {
        return 10000;
    }
}
