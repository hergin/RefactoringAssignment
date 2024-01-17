public class InsuranceStrategyMedium extends InsuranceStrategy {
    @Override
    int getAdjustment() {
        return 10000;
    }

    @Override
    double getWeight() {
        return 0.2;
    }

    @Override
    int getConstant() {
        return 35600;
    }
}
