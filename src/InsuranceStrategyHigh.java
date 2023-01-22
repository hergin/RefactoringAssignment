public class InsuranceStrategyHigh extends InsuranceStrategy {
    @Override
    int getAdjustment() {
        return 30000;
    }

    @Override
    double getWeight() {
        return .1;
    }

    @Override
    int getConstant() {
        return 76500;
    }
}
