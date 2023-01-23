public class InsuranceStrategyVeryHigh extends InsuranceStrategy {

    static int getAdjustment() {
        return 60000;
    }

    static double getWeight() {
        return 0.02;
    }

    static int getConstant() {
        return 105600;
    }
}