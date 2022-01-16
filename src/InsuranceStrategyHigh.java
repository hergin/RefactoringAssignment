public class InsuranceStrategyHigh extends InsuranceStrategy {

    @Override
    boolean incomeWithinTolerance(double income) {
        return income <= 60000 && income > 30000;
    }

    @Override
    int getConstant() {
        return 76500;
    }

    @Override
    double getWeight() {
        return 0.1;
    }

    @Override
    int getAdjustment() {
        return 30000;
    }
}
