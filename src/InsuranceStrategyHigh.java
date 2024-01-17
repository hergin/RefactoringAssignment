public class InsuranceStrategyHigh extends InsuranceStrategy {
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

    @Override
    double getMinimum() {
        return 30000;
    }

    @Override
    double getMaximum() {
        return 60000;
    }
}
